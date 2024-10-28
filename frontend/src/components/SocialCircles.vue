<template>
  <div>
    <div class="cy" ref="cyRef" v-show="isGraphVisible"></div>
  </div>
</template>

<script>
  import cytoscape from "cytoscape";
  import { ref, onMounted } from "vue";

  export default {
    name: "SocialCircles",
    setup() {
      const cyRef = ref(null);
      const isGraphVisible = ref(false);
      let cy = null;

      async function fetchGraphData() {
        try {
          const response = await fetch("http://localhost:8080/api/socialdata");
          const graphData = await response.json();
          isGraphVisible.value = true;
          initCytoscape(graphData);
        } catch (error) {
          console.error("Error fetching social circles data:", error);
        }
      }

      function initCytoscape(data) {
        if (cy) {
          cy.destroy();
        }
        cy = cytoscape({
          container: cyRef.value,
          elements: data.elements,
          style: [
            {
              selector: "node",
              style: {
                "background-color": "#666",
                label: "data(id)",
                "text-valign": "center",
                "text-halign": "center",
                color: "#fff",
                "width": "50px",
                "height": "50px",
              },
            },
            {
              selector: "edge",
              style: {
                "width": 3,
                "line-color": "#ccc",
                "target-arrow-color": "#ccc",
                "target-arrow-shape": "triangle",
              },
            },
          ],
          layout: {
            name: "cose", // 使用適合的佈局
            padding: 30,
          },
        });

        this.cy.fit(); // 自動調整圖形到可見範圍
      }

      onMounted(() => {
        fetchGraphData(); // 在組件加載時調用
      });

      return {
        fetchGraphData,
        cyRef,
        isGraphVisible,
      };
    },
  };
</script>

<style>
  .cy {
    width: 100%;
    height: 600px;
    margin: auto; /* 使容器居中 */
  }
</style>

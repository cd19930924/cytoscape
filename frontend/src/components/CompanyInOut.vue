<template>
  <div>
    <button class="fetch-button" @click="fetchGraphData">公司進出口資料</button>
    <div class="cy" ref="cyRef"></div>
  </div>
</template>

<script>
  import cytoscape from 'cytoscape';

  export default {
    name: 'CompanyInOut',
    data() {
      return {
        cy: null,
      };
    },
    methods: {
      async fetchGraphData() {
        try {
          const response = await fetch('http://localhost:8080/api/getdata');
          const graphData = await response.json();
          this.initCytoscape(graphData);
        } catch (error) {
          console.error('Error fetching graph data:', error);
        }
      },
      initCytoscape(data) {
        this.cy = cytoscape({
          container: this.$refs.cyRef,
          elements: data.elements,
          style: [
            {
              selector: 'node',
              style: {
                "background-color": function (ele) {
                  return ele.data("id") === "a1" ? "#fa39cd" : "yellow";
                },
                label: function (ele) {
                  return ele.data("banNm") !== null
                    ? ele.data("banNm")
                    : ele.data("node");
                },
                "text-valign": "center",
                "text-wrap": "none",
                "text-max-width": 70,
                height: 60,
                width: 60,
                "font-size": 10,
              },
            },
            {
              selector: 'edge',
              style: {
                width: 1,
                "line-color": function (ele) {
                  return ele._private.data.edge_color == "pink" ? "#e344d8" : "blue";
                },
                "mid-target-arrow-color": function (ele) {
                  return ele._private.data.arrow === "buy" ? "orange" : "#31B404";
                },
                "mid-target-arrow-shape": "triangle",
                "curve-style": "bezier",
                "control-point-step-size": 15,
                "arrow-scale": 1.5,
              },
            },
            {
              selector: 'node:selected',
              style: {
                "background-color": "red",
                "border-color": "#22ee00",
              },
            },
            {
              selector: 'edge:selected',
              style: {
                "line-color": "red",
              },
            },
            {
              selector: '.multiline',
              style: {
                "text-wrap": "wrap",
                "text-max-width": "100",
              },
            },
            {
              selector: ':parent',
              style: {
                "text-valign": "top",
                "text-halign": "center",
                "background-color": "#ECF5FF",
                "font-size": 30,
              },
            },
          ],
          layout: {
            name: 'concentric',
            rows: 1,
            padding: 1,
            minNodeSpacing: 40,
            spacingFactor: 0.7,
            directed: true,
          },
          wheelSensitivity: 0.1,
          minZoom: 0.3,
        });
        this.cy.fit(); // 自動調整圖形到可見範圍
      }
    }
  };
</script>

<style>
  .cy {
    width: 100%;
    height: 600px;
    position: relative;
  }

  .fetch-button {
    padding: 10px 20px;
    font-size: 16px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    margin-bottom: 20px;
    transition: background-color 0.3s ease;
  }

  .fetch-button:hover {
    background-color: #45a049;
  }

  .fetch-button:active {
    background-color: #3e8e41;
  }
</style>

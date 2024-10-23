<template>
    <div ref="cy" style="width: 100%; height: 600px;"></div>
</template>
  
<script>
  import cytoscape from 'cytoscape';
  
  export default {
    name: 'CytoscapeGraph',
    mounted() {
      this.fetchGraphData();
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
          container: this.$refs.cy,
          elements: data.elements,
          style: [
            {
              selector: 'node',
              style: {
                'background-color': '#666',
                'label': 'data(id)',
                'text-valign': 'center',
                'text-halign': 'center',
                'color': '#fff',
                'width': '50px',
                'height': '50px',
              }
            },
            {
              selector: 'edge',
              style: {
                'width': 3,
                'line-color': '#ccc',
                'target-arrow-color': '#ccc',
                'target-arrow-shape': 'triangle'
              }
            }
          ],
          layout: {
            name: 'grid',
            rows: 1
          }
        });
      }
    }
  };
</script>
  
<style>
  
</style>
  
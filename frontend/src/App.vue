<template>
  <div id="app">
    <button @click="currentPage = 'company'">公司進出口資料</button>
    <button @click="currentPage = 'social'">社交朋友圈資料</button>

    <company-in-out ref="company" v-if="currentPage === 'company'" />
    <social-circle ref="social" v-if="currentPage === 'social'" />
  </div>
</template>

<script>
  import companyInOut from './components/CompanyInOut.vue';
  import socialCircle from './components/SocialCircles.vue';

  export default {
    data() {
      return {
        currentPage: 'company', 
      };
    },
    components: {
      companyInOut,
      socialCircle,
    },
    watch: {
      currentPage(newPage) {
        // 確保在頁面切換時呼叫相應的 fetchGraphData 方法
        if (this.$refs[newPage]) {
          this.$refs[newPage].fetchGraphData();
        }
      }
    },
  };
</script>

<style>
  button {
    padding: 10px 20px;
    margin: 5px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s ease;
  }

  button:hover {
    background-color: #45a049;
  }

  button:active {
    background-color: #3e8e41;
  }
</style>

<template>
  <h1>这是Home组件</h1>
  <el-table :data="[]"></el-table>
    <el-button type="success">测试按钮</el-button>
    <aside-bar />
</template>

<script>
export default {
    name: 'test',
    components: {},

    methods:{
      testButton(){
        
      }
    }


}
</script>

<style>

</style>
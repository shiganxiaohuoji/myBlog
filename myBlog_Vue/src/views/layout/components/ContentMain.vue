<template>
  <section class="content-container">
    <h1>内容显示</h1>
    <router-view :key="key"/>
  </section>
</template>

<script>
export default {
    name: 'ContentMain',
    computed:{
        key(){
            return this.$route.path
        }
    }

}
</script>

<style>
.content-container{
    height: 100%;
    margin: 60px 30px;
    background-color: #fff;
    /* position: relative; */
    
}

</style>
<template>
  <section class="content-container">
    <transition name="fade-transform" mode="out-in">
      <router-view :key="key"/>
    </transition>
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
    margin: 75px 30px;
    background-color: #fff;
    box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1)
    /* position: relative; */
    
}

</style>
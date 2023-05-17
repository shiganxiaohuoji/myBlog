<template>
  <!-- vue2写法 -->
  <!-- <section class="content-container">
    <transition name="fade-transform" mode="out-in">
      <router-view :key="key"/>
    </transition>
  </section> -->

  <!-- vue3写法 -->
  <section class="content-container">
<router-view v-slot="{ Component }">
  <transition>
    <component :is="Component" />
  </transition>
</router-view>
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

<style scoped>
.content-container{
    /* height: 100%;
    margin: 75px 30px;
    overflow: hidden;
    background-color: #fff; */
    /* box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1) */
    /* position: relative; */

    /*50 = navbar  */
		min-height: calc(100vh - 50px);
		width: 100%;
		position: relative;
		overflow: hidden;
		padding: 60px 0;
    
}

</style>

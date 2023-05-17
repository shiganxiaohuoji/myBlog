<template>
  <div class="write-blog">
    <div class="submitButton">
      <el-button type="primary" size="large" icon="Check">保存</el-button>
      <el-button type="success" size="large" icon="Editor" >发布</el-button>
    </div>
    
    <div class="form">
    <el-form :model="form" label-position="top">
      <el-row :gutter="20">
        <el-col :span="12">
          <el-form-item label="文章标题" prop="title">
            <el-input v-model="form.title" placeholder="请输入标题"></el-input>
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item label="首页轮播图" prop="firstPicture">
            <el-input v-model="form.fristpicture" placeholder="文章首图,用于随机文章展示"></el-input>
          </el-form-item>
        </el-col>
      </el-row>

      <el-form-item label="文章描述" prop="description">
        <mavon-editor v-model="form.description"/>
      </el-form-item>
      <el-form-item label="文章正文" prop="content">
        <mavon-editor v-model="form.content"/>
      </el-form-item>

      <el-row :gutter="20">
        <el-col :span="12">
          <el-form-item label="分类" prop="cate">
            <el-select v-model="form.cate" placeholder="请选择分类(可以通过输入创建分类)" :allow-create="true" :filterable="true" style="width:100%">
              <el-option label="分类1" value="cate1"></el-option>
              <el-option label="分类2" value="cate2"></el-option>
            </el-select>
          </el-form-item>
        </el-col>
        <el-col :span="12">
          <el-form-item label="标签" prop="tagList">
            <el-select v-model="form.tagList" placeholder="文章首图,用于随机文章展示(可通过输入创建分类)" :allow-create="true" :filterable="true" style="width:100%">
              <el-option label="标签1" value="tag1" ></el-option>
              <el-option label="标签1" value="tag1" ></el-option>
              <!-- <el-option :label="item.name" :value="item.id" v-for="item in tagList" :key="item.id"></el-option> -->
            </el-select>
          </el-form-item>
        </el-col>
      </el-row>
    
    </el-form>
  </div>
  </div>
  
</template>

<script>
import { Check,Edit } from '@element-plus/icons-vue';
export default {
  name: "WriteBlog",
  components:{},
  data(){
    return{
      form:{
        title:'',
        fristpicture:'',
        description:'',
        content:'',
        cate:null,
        tagList: [],


      }
    }
  }

}
</script>

<style>
.write-blog{
  display: flex;
  flex-direction: column;
}
.submitButton{
  text-align: right;
  margin: 10px;
}

</style>
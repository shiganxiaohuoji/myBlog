import { createRouter, createWebHistory} from 'vue-router'

const history = createWebHistory()

const router = createRouter({
    history,
    routes:[
        {
            path: '/',
            name: '首页',
            component: () => import('@/views/layout/index.vue'),
            meta: {title: '首页'},
            hidden: true
        },
        {
            path: '/DashBoard',
            name: 'DashBoard',
            component: () => import('../views/Home.vue'),
            meta: {title: 'DashBoard'}
        },
        {
            path: '/blog',
            name: 'Blog',
            redirect: '/blog/write',
            meta: {title: '博客管理', icon:''},
            children: [
                {
                    path: 'write',
                    name: 'WriteBlog',
                    component: () => import('../views/page/WriteBlog.vue'),
                    meta: {title: '写文章', icon: 'el-icon-edit'}
                },
                {
                    path: 'moment/write',
                    name: 'WriteMoment',
                    component: () => import('@/views/page/Moment.vue'),
                    meta: {title: '写动态', icon: 'el-icon-edit'}
                },
                {
                    path: 'edit/:id',
                    name: 'EditBlog',
                    component: () => import('@/views/page/WriteBlog.vue'),
                    meta: {title: '编辑文章', icon: 'el-icon-edit'},
                    
                },
                {
                    path: 'moment/edit/:id',
                    name: 'EditMoment',
                    component: () => import('../views/page/Moment.vue'),
                    meta: {title: '编辑动态', icon: 'el-icon-edit'},
                    
                },
                {
                    path: 'list',
                    name: 'BlogList',
                    component: () => import('../views/page/BlogList.vue'),
                    meta: {title: '文章管理', icon: 'el-icon-s-order'}
                },
                {
                    path: 'moment/list',
                    name: 'MomentList',
                    component: () => import('../views/page/MomentList.vue'),
                    meta: {title: '动态管理', icon: 'el-icon-chat-dot-round'}
                },
                {
                    path: 'category/list',
                    name: 'CategoryList',
                    component: () => import('../views/page/CategoryList.vue'),
                    meta: {title: '分类管理', icon: 'el-icon-s-opportunity'}
                },
                {
                    path: 'tag/list',
                    name: 'TagList',
                    component: () => import('../views/page/TagList.vue'),
                    meta: {title: '标签管理', icon: 'biaoqian'}
                },
                {
                    path: 'comment/list',
                    name: 'CommentList',
                    component: () => import('../views/page/CommentList.vue'),
                    meta: {title: '评论管理', icon: 'el-icon-s-comment'}
                },
            ]

        },
        // {
        //     path: '/page',
        //     name: 'Page',
        //     redirect: '/page/site',
        //     component: Page,
        //     meta: {title: '页面管理', icon: 'el-icon-document-copy'},
        //     children: [
        //         {
        //             path: 'site',
        //             name: 'SiteSetting',
        //             component: () => import('../views/page/SiteSetting.vue'),
        //             meta: {title: '站点设置', icon: 'bianjizhandian'}
        //         },
        //         {
        //             path: 'friend',
        //             name: 'FriendList',
        //             component: () => import('../views/page/FriendList.vue'),
        //             meta: {title: '友链管理', icon: 'friend'}
        //         },
        //         {
        //             path: 'about',
        //             name: 'About',
        //             component: () => import('../views/page/About.vue'),
        //             meta: {title: '关于我', icon: 'el-icon-tickets'}
        //         },
        //     ]
        // },

    ]
})

export default router
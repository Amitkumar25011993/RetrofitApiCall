package com.example.amit.fabgradproject.Model;

import java.util.List;

/**
 * Created by amit on 2/15/2018.
 */

public class User {


    /**
     * us_modules : ["module1","module2","module4"]
     * us_icon : /media/university-subject-images/subject_9YzygBj.png
     * us_id : 23
     * us_title : solid state devices ##
     * modules : [{"topics":[{"ust_icon":"/media/university-subject-topic-images/subject_A7BJXN3.png","total_subtopics":3,"title":"semiconductor devices ##","pos":1,"completed_subtopics":3,"id":13},{"ust_icon":"/static/new/images/nouploads.png","total_subtopics":3,"title":"Equations of state ##","pos":5,"completed_subtopics":3,"id":14},{"ust_icon":"/static/new/images/nouploads.png","total_subtopics":3,"title":"pn junction ##","pos":6,"completed_subtopics":3,"id":15}],"name":"module1"},{"topics":[{"ust_icon":"/static/new/images/nouploads.png","total_subtopics":3,"title":"Transistors ##","pos":2,"completed_subtopics":2,"id":16},{"ust_icon":"/static/new/images/nouploads.png","total_subtopics":3,"title":"MOSFET ##","pos":3,"completed_subtopics":3,"id":17},{"ust_icon":"/static/new/images/nouploads.png","total_subtopics":3,"title":"Inverter ##","pos":4,"completed_subtopics":3,"id":18}],"name":"module2"},{"topics":[{"ust_icon":"/static/new/images/nouploads.png","total_subtopics":0,"title":"trial topic","pos":7,"completed_subtopics":0,"id":33}],"name":"module4"}]
     * bgcolor : 39a385
     * us_topics_count : 7
     * result : Success
     * us_subtopics_count : 18
     * module_codes : [{"module1":"m1"},{"module2":"m2"},{"module3":"m3"},{"module4":"m4"},{"module5":"m5"},{"module6":"m6"},{"module7":"m7"},{"module8":"m8"}]
     */

    private String us_icon;
    private String us_id;
    private String us_title;
    private String bgcolor;
    private int us_topics_count;
    private String result;
    private int us_subtopics_count;
    private List<String> us_modules;
    private List<ModulesBean> modules;
    private List<ModuleCodesBean> module_codes;

    public String getUs_icon() {
        return us_icon;
    }

    public void setUs_icon(String us_icon) {
        this.us_icon = us_icon;
    }

    public String getUs_id() {
        return us_id;
    }

    public void setUs_id(String us_id) {
        this.us_id = us_id;
    }

    public String getUs_title() {
        return us_title;
    }

    public void setUs_title(String us_title) {
        this.us_title = us_title;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    public int getUs_topics_count() {
        return us_topics_count;
    }

    public void setUs_topics_count(int us_topics_count) {
        this.us_topics_count = us_topics_count;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getUs_subtopics_count() {
        return us_subtopics_count;
    }

    public void setUs_subtopics_count(int us_subtopics_count) {
        this.us_subtopics_count = us_subtopics_count;
    }

    public List<String> getUs_modules() {
        return us_modules;
    }

    public void setUs_modules(List<String> us_modules) {
        this.us_modules = us_modules;
    }

    public List<ModulesBean> getModules() {
        return modules;
    }

    public void setModules(List<ModulesBean> modules) {
        this.modules = modules;
    }

    public List<ModuleCodesBean> getModule_codes() {
        return module_codes;
    }

    public void setModule_codes(List<ModuleCodesBean> module_codes) {
        this.module_codes = module_codes;
    }

    public static class ModulesBean {
        /**
         * topics : [{"ust_icon":"/media/university-subject-topic-images/subject_A7BJXN3.png","total_subtopics":3,"title":"semiconductor devices ##","pos":1,"completed_subtopics":3,"id":13},{"ust_icon":"/static/new/images/nouploads.png","total_subtopics":3,"title":"Equations of state ##","pos":5,"completed_subtopics":3,"id":14},{"ust_icon":"/static/new/images/nouploads.png","total_subtopics":3,"title":"pn junction ##","pos":6,"completed_subtopics":3,"id":15}]
         * name : module1
         */

        private String name;
        private List<TopicsBean> topics;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<TopicsBean> getTopics() {
            return topics;
        }

        public void setTopics(List<TopicsBean> topics) {
            this.topics = topics;
        }

        public static class TopicsBean {
            /**
             * ust_icon : /media/university-subject-topic-images/subject_A7BJXN3.png
             * total_subtopics : 3
             * title : semiconductor devices ##
             * pos : 1
             * completed_subtopics : 3
             * id : 13
             */

            private String ust_icon;
            private int total_subtopics;
            private String title;
            private int pos;
            private int completed_subtopics;
            private int id;

            public String getUst_icon() {
                return ust_icon;
            }

            public void setUst_icon(String ust_icon) {
                this.ust_icon = ust_icon;
            }

            public int getTotal_subtopics() {
                return total_subtopics;
            }

            public void setTotal_subtopics(int total_subtopics) {
                this.total_subtopics = total_subtopics;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getPos() {
                return pos;
            }

            public void setPos(int pos) {
                this.pos = pos;
            }

            public int getCompleted_subtopics() {
                return completed_subtopics;
            }

            public void setCompleted_subtopics(int completed_subtopics) {
                this.completed_subtopics = completed_subtopics;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }

    public static class ModuleCodesBean {
        /**
         * module1 : m1
         * module2 : m2
         * module3 : m3
         * module4 : m4
         * module5 : m5
         * module6 : m6
         * module7 : m7
         * module8 : m8
         */

        private String module1;
        private String module2;
        private String module3;
        private String module4;
        private String module5;
        private String module6;
        private String module7;
        private String module8;

        public String getModule1() {
            return module1;
        }

        public void setModule1(String module1) {
            this.module1 = module1;
        }

        public String getModule2() {
            return module2;
        }

        public void setModule2(String module2) {
            this.module2 = module2;
        }

        public String getModule3() {
            return module3;
        }

        public void setModule3(String module3) {
            this.module3 = module3;
        }

        public String getModule4() {
            return module4;
        }

        public void setModule4(String module4) {
            this.module4 = module4;
        }

        public String getModule5() {
            return module5;
        }

        public void setModule5(String module5) {
            this.module5 = module5;
        }

        public String getModule6() {
            return module6;
        }

        public void setModule6(String module6) {
            this.module6 = module6;
        }

        public String getModule7() {
            return module7;
        }

        public void setModule7(String module7) {
            this.module7 = module7;
        }

        public String getModule8() {
            return module8;
        }

        public void setModule8(String module8) {
            this.module8 = module8;
        }
    }
}

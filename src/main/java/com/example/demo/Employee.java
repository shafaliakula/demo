package com.example.demo;


    class Employee {
        private String name;
        private int experience;
        private String role;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getExperience() {
            return experience;
        }
        public void setExperience(int experience) {
            this.experience = experience;
        }
        public String getRole() {
            return role;
        }
        public void setRole(String role) {
            this.role = role;
        }
        public Employee(String name, int experience, String role) {
            this.name = name;
            this.experience = experience;
            this.role = role;
        }
    }




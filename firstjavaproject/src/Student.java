
    class Student{
        private int studentId;
        private String name;
        private String address;
        public static int idCount=0;

        public Student( String name, String address) {

            idCount++;
            this.studentId = idCount;
            this.name = name;
            this.address = address;
        }
        public void setAddress( String add)
        {
            this.address=add;
        }
        public String getName()
        {
            return(name);
        }
        public String greet(){
            return ("Hello  " + this.name);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "studentId=" + studentId +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

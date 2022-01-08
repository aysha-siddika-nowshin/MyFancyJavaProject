public class add {



    private static  Testclass tc;
    private int x;
    private int y;
    private add(int x,int y){
        this.x=x;
        this.y=y;
    }

    public static Testclass getTc(int x,int y){
        if(tc == null){
            tc = new Testclass(x,y);
        }
        return tc;
    }



    public static void main(String args[]) {

    }
    private static class TestClass {

        public TestClass() {
        }

        private TestClass(int x, int y) {
            int z = x+y;
        }
    }

}

}

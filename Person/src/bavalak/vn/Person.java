package bavalak.vn;


public class Person {
    private int id;
    private int years;
    private int height;

    public Person() {
    }

    public Person(int id, int years, int height) {
        this.id = id;
        this.years = years;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "<"+id+", "+years +", "+height+">";
    }

    public static void main(String[] args) {
        // write your code here
        int n = 7;
        int[] ids = {1, 2, 3, 4, 5, 6, 7};
        int[] ages = {23, 24, 22, 23, 24, 22, 23};
        int[] heights = {180, 182, 180, 178, 177, 178, 178};


        Person person[] = new Person[n];


        for (int i = 0; i < n; i++) {
            person[i] = new Person(ids[i], ages[i], heights[i]);
        }

        System.out.println("Contents of the array:");
        for (int i = 0; i < n; i++) {
            System.out.println(person[i].toString());;
        }

        //end of inner for loop
        // end of outer for loop

        System.out.println("The sorted array (descending order of age):");
        for (int i = 0; i < n - 1; i++) {
           for(int j = i + 1; j < n; j++){
               if(person[j].getYears() > person[i].getYears()){
                    Person temp = person[j];
                    person[j] = person[i];
                    person[i] = temp;
               }
           }
        }//end of inner for loop

        System.out.println("The sorted array (descending order of age):");
        for (int i = 0; i < n; i++) {
            System.out.println(person[i].toString());;
        }
    }

}
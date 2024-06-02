class Students{
    String name;
    int marks;
    int roll; 
}

public class arrayof_objects{
    public static void main(String[] a){
        Students s1 = new Students();
        s1.name = "Rudra";
        s1.marks = 98;
        s1.roll = 67;

        Students s2 = new Students();
        s2.name = "Riya";
        s2.marks = 99;
        s2.roll = 66;

        Students Students_array[] = new Students[2];
        Students_array[0] = s1;
        Students_array[1] = s2;

        for(int i = 0 ; i < Students_array.length ; i++ ){
            System.out.println(Students_array[i].name + ":" + Students_array[i].marks);
        }
        System.out.println();
        for( Students record : Students_array){
            System.out.println(record.name + ":" + record.marks);
        }

    }
}


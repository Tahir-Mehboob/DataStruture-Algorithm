public class Array{
    
    private int count=0;
    private int myArr[];
   

    public Array(int size){
        myArr = new int[size];
    }

    public void insert(int item){
        if(myArr.length == count){
            int newArr[] = new int[count*2];

            for(int i=0;i<count; i++){
                    newArr[i] = myArr[i];
                    myArr=newArr; 
            }
        }

        myArr[count++]=item;      
    }

     public void removeAt(int index){
             if(index <0 || index>=count)
                 throw  new IllegalArgumentException();

                // shift element in left side after remove
             
             for(int i=index ; i< count ;i++ ){
                myArr[i] = myArr[i+1];
                count--;
             }
             
     }

    public void myPrint(){
        for(int num : myArr){
            System.out.print(num+"    ");
        }
    }


}
  class Demo {

    public static void main(String[] args){

        System.out.println("Prime numbers between 2 to 100");

        int num;
      
        for( num = 2; num <= 100 ; num ++ ){
            
                int counting;
                int count = 0;
                
                for(counting = 1; counting <= num; counting++){

                    if (num % counting == 0) {
                        count = count + 1 ;                
                }
            }

            if (count <= 2) {            
                System.out.println(num);
            }            
        }

    }

}


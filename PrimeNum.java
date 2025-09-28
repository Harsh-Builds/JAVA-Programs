 class PrimeNum {

    public static void main(String[] args){

        System.out.println("Prime numbers between 2 to 100");

        int num ;
        int thePrime = 2;
        for( num = 2; num <= 100 ; num ++ ){
            
            if (thePrime <= 100) {
                
                int counting;
                int count = 0;
                
                for(counting = 1; counting <= thePrime; counting++){

                    if (thePrime % counting == 0) {
                        count = count + 1 ;
                   
                }

            }

            if (count <= 2) {
                
                System.out.println(thePrime);
            }

            }

            thePrime = thePrime + 1 ;
        }

    }

}

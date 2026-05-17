public class Q7 {
    public static void main(String[] args) {
        double cost=10000;
        for(int i = 1; i <= 10; i++){
            cost=cost+cost*0.05;
          System.out.printf("The cost of the tuition in the (%d) year (%,.0f) \n",(i),cost);
        }
        double totalCost=0;
        for(int i = 1; i <= 4; i++){
            cost=cost+cost*0.05;
            totalCost+=cost;
        }
        System.out.printf("The Total cost of the starting after the tenth year.  (%,.0f) \n",totalCost);
    }
}

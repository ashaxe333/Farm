public class Snowflower extends Flower{

    private Type type = Type.SNOWFLOWER;
    public Snowflower(String name, double price, double neededArea, double chanceOfGrowth) {
        super(name, price, neededArea, chanceOfGrowth);
    }

    public void chanceOfGrowthIncrease(Farmer farmer){
        if(farmer.isWater()){
            chanceOfGrowth = chanceOfGrowth*2;
        }
    }


}

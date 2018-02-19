package farmsimulator;

public class MilkingRobot {
    
    private BulkTank tank;
    
    BulkTank getBulkTank() {
        return tank;
    }
    
    void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }
    
    void milk(Milkable milkable) {
        if (tank == null) {
            throw new IllegalStateException("Bulk tank not connected");
        }
        
        this.tank.addToTank(milkable.milk());
    }
}

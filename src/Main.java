public class Main
{
    public static void main(String args[])
    {
        TwoD_array obj = new TwoD_array(3,3);
        obj.traverseArray();
        obj.insertValueInArray(0,2,1000000001);
        obj.traverseArray();
        obj.insertValueInArray(0,2,10000242);
        obj.traverseArray();
        obj.insertValueInArray(0,2,10000);
        obj.insertValueInArray(0,3,12425362);
        obj.accessingSingleCell(0,2);
        obj.searchingSingleValue(10);
        obj.deletingSingleValue(0,2);
        obj.deleteThisArray();
        obj.traverseArray();

    }
}
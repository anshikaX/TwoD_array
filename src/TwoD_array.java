
public class TwoD_array
{
    int arr[][];

    //Constructor
    TwoD_array(int numberOfRows,int numberOfColumns)
    {
        this.arr = new int[numberOfRows][numberOfColumns];
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[0].length;col++)
            {
                arr[row][col]= Integer.MIN_VALUE;
            }
        }
    }

    //Traversal of 2D array

    public void traverseArray()
    {
        try
        {
            System.out.println("Printing the array now...");
            for(int row=0;row<arr.length;row++)
            {
                for(int col=0;col<arr[0].length;col++)
                {
                    System.out.println(arr[row][col]+ " ");
                }
                System.out.println();
            }
            System.out.println("\n");

        }
        catch(Exception e)
        {
            System.out.println("Array doesn't exist");
        }
    }

    //Inserting value in 2D array
    public void insertValueInArray(int row,int col,int value)
    {
        try
        {
            if(arr[row][col]==Integer.MIN_VALUE)    //Checking whether cell is empty or not
            {
                arr[row][col]= value;
                System.out.println("Successfully inserted " +value + " in the array");
            }
            else
            {
                System.out.println("Cell is occupied by some other value and it is not empty");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index to access array");
            //e.printStackTrace();
        }
    }

    //Accessing elements from 2D array
    public void accessingSingleCell(int row,int col)
    {
        System.out.println("\nAccessing row " +row + ", col" +col + " ...");
        try
        {
            System.out.println("Cell value is: " + arr[row][col]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index to access array");
            e.printStackTrace();
        }
        System.out.println();
    }

    //Searching a single value from the array
    public void searchingSingleValue(int value)
    {
        System.out.println("\nSearching value " +value + " in the array");
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[0].length;col++)
            {
                if(arr[row][col]==value)
                {
                    System.out.println("Value is found!!");
                }
                else
                {
                    System.out.println("Value isn't found!");
                }
            }
        }
    }

    //Deleting a cell value from 2D array
    public void deletingSingleValue(int deleteValueFromRow,int deleteValueFromColumn)
    {
        System.out.println("Deleting value from row " +deleteValueFromRow + " and from Column " + deleteValueFromColumn + " ....");
        try
        {
            System.out.println("Successfully deleted: " + arr[deleteValueFromRow][deleteValueFromColumn]);
            arr[deleteValueFromRow][deleteValueFromColumn]=Integer.MIN_VALUE;  //Inserting a value here

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index to access");
        }
    }

    //Delete the entire array

    public void deleteThisArray()
    {
        arr = null;
        System.out.println("Array has been successfully deleted");
    }




}
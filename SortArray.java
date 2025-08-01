class SortArray
{
    public static void main(String[] args)
    {
        int[] numbers = {28,20,1,96,88};

        System.out.println("Before Sorting:");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        // Sorting the array manually using Bubble Sort
        for (int i = 0; i < numbers.length - 1; i++)
        {
            for (int j = 0; j < numbers.length - 1 - i; j++)
            {
                if (numbers[j] > numbers[j + 1])
                {
                    // swap elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("After Sorting (Ascending Order):");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
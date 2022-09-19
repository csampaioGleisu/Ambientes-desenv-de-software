class QuickSort
{
    int partition(int array[], int menor, int maior)
    {
        int pivot = array[maior];
        int i = (menor-1);
        for (int j= menor; j < maior; j++)
        {

            if (array[j] <= pivot)
            {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }


        int temp = array[i+1];
        array[i+1] = array[maior];
        array[maior] = temp;

        return i+1;
    }



    void sort(int array[], int menor2, int maior2)
    {
        if (menor2 < maior2)
        {

            int pi = partition(array, menor2, maior2);


            sort(array, menor2, pi-1);
            sort(array, pi+1, maior2);
        }
    }


    static void printArray(int array[])
    {
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }

   
    public static void main(String args[])
    {
        int array[] = {10, 20, 8, 37, 1, 5, 12, 100};
        int n = array.length;

        QuickSort ob = new QuickSort();
        ob.sort(array, 0, n-1);

        System.out.println("números ordenados");
        printArray(array);
    }
}

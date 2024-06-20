package org.example;

public class ArrayList
{
    private int []arr;
    private int size;
    private int n;

    public ArrayList(int s)
    {
     size = s;
     arr = new int [size];
     n = 0;
    }

    public void insert(int val)
    {
        if (n != size-1)
        {
            arr[n] = val;
            n++;
        }
    }

    public int get(int ind)
    {
        if(ind <= n)
        return arr[ind];

        return -1;
    }

    public void remove_last()
    {
       if (n != 0)
            n--;
    }

    public int getN()
    {
        return n;
    }


}

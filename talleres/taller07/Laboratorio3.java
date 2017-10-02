public class Laboratorio3 {
    public static void main(String[] args)
    {
        LinkedListMauricio list = new LinkedListMauricio();
        
        list.insert(5, 0);
        list.insert(4, 0);
        list.insert(3, 0);
        list.insert(2, 0);
        list.insert(1, 0);
        
        LinkedListMauricio list1 = new LinkedListMauricio();
        
        list1.insert(5, 0);
        list1.insert(4, 0);
        list1.insert(3, 0);
        list1.insert(2, 0);
        list1.insert(1, 0);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println(list.contains(3));
        list.remove(2);
        System.out.println(list.contains(3));
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("comparar");
        System.out.println(comparar(list , list1));
    }

    private static boolean comparar(LinkedListMauricio a1, LinkedListMauricio a2){
        int apro=0;
        boolean comp=false;
        if(a1.size()!=a2.size())return comp;
        else{
            for (int i = 0; i < a1.size(); i++){
                if(a1.get(i)==a2.get(i)){
                   apro++; 
                }else{
                    break;
                }
            }
        }
        if(apro==a1.size())comp=true;
        else comp=false;
        return comp;
    }
}
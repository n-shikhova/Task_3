import java.util.HashMap;

class Main {
    public static String findMax(String[] dates) {

        String res_name = "";
        int max_num_ = 0;
        HashMap<String, Integer> dictionary = new HashMap<>();

        for(String data_ : dates) {
            String name_ = data_.split(" ")[0];
            int num_ = Integer.parseInt(data_.split(" ")[1]);



            //  проверка наличия ключа
            if (dictionary.containsKey(name_)){

                if (dictionary.get(name_)+num_ > max_num_) {
                    max_num_ = dictionary.get(name_)+num_;
                    res_name = name_;
                }

                // такой ключ есть прибавляем новые очки к имеющимся у него ранее
                dictionary.put(name_,dictionary.get(name_)+num_);

                System.out.println(dictionary+" Лидирует: "+res_name);


            }

            // такого ключа нет, добавляем
            else {
                dictionary.put(name_,num_);
            }


        } // конец цикла


        return res_name;


    } // конец функции

    public static void main(String[] args) {
        String[] dates = {"Ivan 5", "Petr 3", "Alex 10", "Petr 8", "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"};
        System.out.println("\nПобедитель: " + findMax(dates) + "!!!");
    }
}
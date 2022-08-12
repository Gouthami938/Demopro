import java.util.*;
public class BookInfo {
        public static void main(String[] args) {
                HashMap<String, ArrayList<Double>> books = new HashMap<>();

                String a = "book1";
                String b = "book2";
                String c = "book3";
                String d = "book4";
                String e = "book5";

                books.put(a, new ArrayList<Double>());
                books.get(a).add(123.0); //booknumber
                books.get(a).add(250.0); //price
                books.get(a).add(5.0);

                books.put(b, new ArrayList<Double>());
                books.get(b).add(124.0); //booknumber
                books.get(b).add(260.0);
                books.get(b).add(3.0);

                books.put(c, new ArrayList<Double>());
                books.get(c).add(125.0); //booknumber
                books.get(c).add(255.0);
                books.get(c).add(4.0);

                books.put(d, new ArrayList<Double>());
                books.get(d).add(126.0); //booknumber
                books.get(d).add(265.0);
                books.get(d).add(5.0);

                books.put(e, new ArrayList<Double>());
                books.get(e).add(127.0); //booknumber
                books.get(e).add(500.0);
                books.get(e).add(6.0);
                System.out.println("BooksInformation before adding to cart");
                for (Map.Entry<String, ArrayList<Double>> iterator : books.entrySet()) {
                        System.out.println(iterator.getKey() +
                                " booknumber " + iterator.getValue().get(0) +
                                " bookquantity" + iterator.getValue().get(2));
                }


                ArrayList<String> cartbooks = new ArrayList<>();
                System.out.println("The books in cart are");
                cartbooks.add(a);
                cartbooks.add(c);
                cartbooks.add(e);

                double totalprice = 0.0;

                for (int i = 0; i < cartbooks.size(); i++) {
                        System.out.println(cartbooks.get(i));
                        if (books.containsKey(cartbooks.get(i))) {
                                if (books.get(cartbooks.get(i)).get(2) != 0) {
                                        double price = books.get(cartbooks.get(i)).get(1);
                                        totalprice += price;
                                        double currentquan = books.get(cartbooks.get(i)).get(2);
                                        books.get(cartbooks.get(i)).remove(2);
                                        books.get(cartbooks.get(i)).add(currentquan - 1);
                                } else {
                                        System.out.println(cartbooks.get(i) + " out of stock");
                                }

                        } else {
                                System.out.println(cartbooks.get(i) + " out of stock");
                        }
                }

                System.out.println("Total Price of books in cart " + totalprice);
                System.out.println("BooksInformation after adding to cart");
                for (Map.Entry<String, ArrayList<Double>> iterator : books.entrySet()) {
                        System.out.println(iterator.getKey() +
                                " booknumber " + iterator.getValue().get(0) +
                                " bookquantity" + iterator.getValue().get(2));
                }

        }
        }



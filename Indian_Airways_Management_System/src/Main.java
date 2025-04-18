import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("                         ");
        System.out.println("Welcome To Indian Airways ");
        System.out.println("Enter 1 For Domestic Flights !");
        System.out.println("Enter 2 For International Flights !");
        int type_of_Flight_DI = sc.nextInt();
        if (type_of_Flight_DI == 1) {
            System.out.println("Welcome To This Domestic ZONE");
            System.out.println("Enter 1 For Delhi to Bengaluru");
            System.out.println("Enter 2 For Kolkata To Delhi");
            int domestic_flight_route_kolkata_to_delhi_delhi_bengaluru = sc.nextInt();
            if (domestic_flight_route_kolkata_to_delhi_delhi_bengaluru == 1) {
                System.out.println("Enter (A) For Checking Availability For Flights on that route");
                String A_For_Checking_Availability_For_Flights = sc.next().toUpperCase();
                if (A_For_Checking_Availability_For_Flights.equalsIgnoreCase("A")) {
                    System.out.println("The Flights In That Route Are In The Given Chart !");
                    String[] flightNumbers = {"1)", "2)", "3)"};
                    String[][] flights = {
                            {"Air India", "AI 514"},
                            {"SpiceJet", "SG 8151"},
                            {"IndiGo", "6E 345"}};
                    System.out.println("+------------+------------+--------+");
                    System.out.println("| Flight No. | Airline    | Flight |");
                    System.out.println("+------------+------------+--------+");
                    for (int i = 0; i < flights.length; i++) {
                        System.out.printf("| %-10s | %-10s | %-6s |\n", flightNumbers[i], flights[i][0], flights[i][1]);
                        ;
                    }
                    System.out.println("+------------+------------+--------+");
                }
                System.out.println("Choose Your FLight By Entering {1,2,3} For Selecting A Particular Flight");
                int choice_particular_flight_domestic_delhi_bengaluru = sc.nextInt();
                if (choice_particular_flight_domestic_delhi_bengaluru == 1) {
                    System.out.println("Enter 1 For Economy Class Per Passenger Rs 5000 !");
                    System.out.println("Enter 2 For First-Class Per Passenger   Rs 7000 !");
                    System.out.println("Enter 3 For Business Class Per Passenger Rs 15,000!");
                    int luxury_mode_selection = sc.nextInt();
                    if (luxury_mode_selection == 1) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 5000) + (children_delhi_bengaluru_economy_class * 0.3 * 1500) + (luggage_weight_delhi_bengaluru_economy_weight_charges);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                    if (luxury_mode_selection == 2) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 7000) + (children_delhi_bengaluru_economy_class * 0.3 * 7000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                    if (luxury_mode_selection == 3) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 15000) + (children_delhi_bengaluru_economy_class * 0.3 * 15000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                }
                if (choice_particular_flight_domestic_delhi_bengaluru == 2) {
                    System.out.println("Enter 1 For Economy Class Per Passenger Rs 4000 !");
                    System.out.println("Enter 2 For First-Class Per Passenger   Rs 6000 !");
                    System.out.println("Enter 3 For Business Class Per Passenger Rs 17,000!");
                    int luxury_mode_selection = sc.nextInt();
                    if (luxury_mode_selection == 1) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 4000) + (children_delhi_bengaluru_economy_class * 0.3 * 4000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                    if (luxury_mode_selection == 2) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 6000) + (children_delhi_bengaluru_economy_class * 0.3 * 6000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                    if (luxury_mode_selection == 3) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 17000) + (children_delhi_bengaluru_economy_class * 0.3 * 17000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }

                }
                if (choice_particular_flight_domestic_delhi_bengaluru == 3) {
                    System.out.println("Enter 1 For Economy Class Per Passenger Rs 4500 !");
                    System.out.println("Enter 2 For First-Class Per Passenger   Rs 7000 !");
                    System.out.println("Enter 3 For Business Class Per Passenger Rs 15,000!");
                    int luxury_mode_selection = sc.nextInt();
                    if (luxury_mode_selection == 1) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 4500) + (children_delhi_bengaluru_economy_class * 0.3 * 4500) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                    if (luxury_mode_selection == 2) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 7000) + (children_delhi_bengaluru_economy_class * 0.3 * 7000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                    if (luxury_mode_selection == 3) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 15000) + (children_delhi_bengaluru_economy_class * 0.3 * 15000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                }

            } else {
                //Route From Kolkata To Delhi !
                System.out.println("Enter (B) For Checking Availability For Flights on that route ");
                String check_available_domestic_kolkata_delhi = sc.next().toUpperCase();
                if (check_available_domestic_kolkata_delhi.equalsIgnoreCase("B")) {
                    System.out.println("The Flights In That Particular Route Are As Follows !");
                    String[][] flights = {
                            {"1) Vistara ", "EK 202"},
                            {"2) Air India", "QR 145"},
                            {"3) Deccan Airways", "BA 123"}
                    };

                    // Display in tabular format
                    System.out.println("-----------------------------------------------------");
                    System.out.println("| Airline           | Flight Number |");
                    System.out.println("-----------------------------------------------------");

                    for (String[] flight : flights) {
                        String airline = flight[0];
                        String flightNumber = flight[1];
                        System.out.printf("| %-18s | %-13s |\n", airline, flightNumber);
                    }

                    System.out.println("-----------------------------------------------------");
                    System.out.println("Choose Your FLight By Entering {1,2,3} For Selecting A Particular Flight\n");
                    int choice_of_flight_kolkata_delhi = sc.nextInt();
                    if (choice_of_flight_kolkata_delhi == 1) {
                        System.out.println("Enter 1 For Economy Class Per Passenger Rs 4700 !");
                        System.out.println("Enter 2 For First-Class Per Passenger   Rs 7500 !");
                        System.out.println("Enter 3 For Business Class Per Passenger Rs 16,000!");
                        int luxury_mode_selection = sc.nextInt();
                        if (luxury_mode_selection == 1) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 4700) + (children_delhi_bengaluru_economy_class * 0.3 * 4700) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 2) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 7500) + (children_delhi_bengaluru_economy_class * 0.3 * 7500) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 3) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 16000) + (children_delhi_bengaluru_economy_class * 0.3 * 16000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }


                    }
                    if (choice_of_flight_kolkata_delhi == 2) {

                        System.out.println("Enter 1 For Economy Class Per Passenger Rs 4200 !");
                        System.out.println("Enter 2 For First-Class Per Passenger   Rs 6900 !");
                        System.out.println("Enter 3 For Business Class Per Passenger Rs 21,000!");
                        int luxury_mode_selection = sc.nextInt();
                        if (luxury_mode_selection == 1) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 4200) + (children_delhi_bengaluru_economy_class * 0.3 * 4200) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 2) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 6900) + (children_delhi_bengaluru_economy_class * 0.3 * 6900) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 3) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 21000) + (children_delhi_bengaluru_economy_class * 0.3 * 21000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }

                    }
                    if (choice_of_flight_kolkata_delhi == 3) {
                        System.out.println("Enter 1 For Economy Class Per Passenger Rs 4000 !");
                        System.out.println("Enter 2 For First-Class Per Passenger   Rs 5900 !");
                        System.out.println("Enter 3 For Business Class Per Passenger Rs 11,000!");
                        int luxury_mode_selection = sc.nextInt();
                        if (luxury_mode_selection == 1) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 4000) + (children_delhi_bengaluru_economy_class * 0.3 * 4000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 2) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 5900) + (children_delhi_bengaluru_economy_class * 0.3 * 5900) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 3) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 11000) + (children_delhi_bengaluru_economy_class * 0.3 * 11000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                    }
                }
            }
        }
        if (type_of_Flight_DI == 2) {
            //Here I Am Going To Have The International Flights !

            System.out.println("Welcome To The International Zone !");
            System.out.println("Enter 1 From India To United States Of America");
            System.out.println("Enter 2 From India To United Arab Emirates ");
            System.out.println("Enter 3 From India To Finland ");
            int foreign_tour_india_to_others = sc.nextInt();
            if (foreign_tour_india_to_others == 1) {
                System.out.println("*** Enter 3 To Check Availability For Flights In That Particular Route *** ");
                int flight_india_to_united_states_of_america = sc.nextInt();
                if (flight_india_to_united_states_of_america == 3) {
                    System.out.println("The Flights In That Particular Route Are As Follows ! ");
                    String[][] flights = {
                            {"1) Qatar AirWays", "JK 102"},
                            {"2) Air India", "WR 145"},
                            {"3) Ryan AirLines", "AA 223"}
                    };

                    // Display in tabular format
                    System.out.println("-----------------------------------------------------");
                    System.out.println("| Airline           | Flight Number |");
                    System.out.println("-----------------------------------------------------");

                    for (String[] flight : flights) {
                        String airline = flight[0];
                        String flightNumber = flight[1];
                        System.out.printf("| %-18s | %-13s |\n", airline, flightNumber);
                    }

                    System.out.println("-----------------------------------------------------");
                    System.out.println("Enter {1,2,3} For Choosing Your Particular Flight ");
                    int flight_international_india_to_us = sc.nextInt();
                    if (flight_international_india_to_us == 1) {
                        System.out.println("Enter 1 For Economy Class Per Passenger Rs 40,000 !");
                        System.out.println("Enter 2 For First-Class Per Passenger   Rs 59,000 !");
                        System.out.println("Enter 3 For Business Class Per Passenger Rs 111,000!");
                        int luxury_mode_selection = sc.nextInt();
                        if (luxury_mode_selection == 1) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 40000) + (children_delhi_bengaluru_economy_class * 0.3 * 40000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 2) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 59000) + (children_delhi_bengaluru_economy_class * 0.3 * 59000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 3) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 110000) + (children_delhi_bengaluru_economy_class * 0.3 * 110000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }

                    }
                    if (flight_international_india_to_us == 2) {
                        System.out.println("Enter 1 For Economy Class Per Passenger Rs 41,000 !");
                        System.out.println("Enter 2 For First-Class Per Passenger   Rs 69,000 !");
                        System.out.println("Enter 3 For Business Class Per Passenger Rs 112,000!");
                        int luxury_mode_selection = sc.nextInt();
                        if (luxury_mode_selection == 1) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 41000) + (children_delhi_bengaluru_economy_class * 0.3 * 41000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 2) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 69000) + (children_delhi_bengaluru_economy_class * 0.3 * 69000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 3) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 120000) + (children_delhi_bengaluru_economy_class * 0.3 * 120000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                    }
                    if (flight_international_india_to_us == 3) {
                        System.out.println("Enter 1 For Economy Class Per Passenger Rs 44,000 !");
                        System.out.println("Enter 2 For First-Class Per Passenger   Rs 70,000 !");
                        System.out.println("Enter 3 For Business Class Per Passenger Rs 120,000!");
                        int luxury_mode_selection = sc.nextInt();
                        if (luxury_mode_selection == 1) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 44000) + (children_delhi_bengaluru_economy_class * 0.3 * 44000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 2) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 70000) + (children_delhi_bengaluru_economy_class * 0.3 * 70000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 3) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 120000) + (children_delhi_bengaluru_economy_class * 0.3 * 120000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                    }
                }
            }
            if (foreign_tour_india_to_others == 2) {
                System.out.println("*** Enter 4 To Check Availability For Flights In That Particular Route *** ");
                int flight_india_to_united_states_of_america = sc.nextInt();
                if (flight_india_to_united_states_of_america == 4) {
                    System.out.println("The Flights In That Particular Route Are As Follows ! ");
                    String[][] flights = {
                            {"1) British Airways", "JK 102"},
                            {"2) Air India", "WR 145"},
                            {"3) Lufthansa", "AA 223"}
                    };

                    // Display in tabular format
                    System.out.println("-----------------------------------------------------");
                    System.out.println("| Airline           | Flight Number |");
                    System.out.println("-----------------------------------------------------");

                    for (String[] flight : flights) {
                        String airline = flight[0];
                        String flightNumber = flight[1];
                        System.out.printf("| %-18s | %-13s |\n", airline, flightNumber);
                    }

                    System.out.println("-----------------------------------------------------");
                    System.out.println("Enter {1,2,3} For Choosing Your Particular Flight ");
                    int flight_international_india_to_us = sc.nextInt();
                    if (flight_international_india_to_us == 1) {
                        System.out.println("Enter 1 For Economy Class Per Passenger Rs 40,000 !");
                        System.out.println("Enter 2 For First-Class Per Passenger   Rs 59,000 !");
                        System.out.println("Enter 3 For Business Class Per Passenger Rs 111,000!");
                        int luxury_mode_selection = sc.nextInt();
                        if (luxury_mode_selection == 1) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 40000) + (children_delhi_bengaluru_economy_class * 0.3 * 40000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 2) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 59000) + (children_delhi_bengaluru_economy_class * 0.3 * 59000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 3) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 110000) + (children_delhi_bengaluru_economy_class * 0.3 * 110000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }

                    }
                    if (flight_international_india_to_us == 2) {
                        System.out.println("Enter 1 For Economy Class Per Passenger Rs 41,000 !");
                        System.out.println("Enter 2 For First-Class Per Passenger   Rs 69,000 !");
                        System.out.println("Enter 3 For Business Class Per Passenger Rs 112,000!");
                        int luxury_mode_selection = sc.nextInt();
                        if (luxury_mode_selection == 1) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 41000) + (children_delhi_bengaluru_economy_class * 0.3 * 41000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 2) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 69000) + (children_delhi_bengaluru_economy_class * 0.3 * 69000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 3) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 120000) + (children_delhi_bengaluru_economy_class * 0.3 * 120000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                    }
                    if (flight_international_india_to_us == 3) {
                        System.out.println("Enter 1 For Economy Class Per Passenger Rs 44,000 !");
                        System.out.println("Enter 2 For First-Class Per Passenger   Rs 70,000 !");
                        System.out.println("Enter 3 For Business Class Per Passenger Rs 120,000!");
                        int luxury_mode_selection = sc.nextInt();
                        if (luxury_mode_selection == 1) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 44000) + (children_delhi_bengaluru_economy_class * 0.3 * 44000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 2) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 70000) + (children_delhi_bengaluru_economy_class * 0.3 * 70000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                        if (luxury_mode_selection == 3) {
                            System.out.println("Enter The Total Number Of Adults !");
                            int adult_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Total Number Of Children !");
                            int children_delhi_bengaluru_economy_class = sc.nextInt();
                            System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                            int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                            double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 120000) + (children_delhi_bengaluru_economy_class * 0.3 * 120000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                            System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                            System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                        }
                    }
                }
            }
            if (foreign_tour_india_to_others == 3) {

                System.out.println("The Flights In That Particular Route Are As Follows ! ");
                String[][] flights = {
                        {"1) Virgin Atlantic", "JK 102"},
                        {"2) Air India", "WR 145"},
                        {"3) Emirates Airlines", "AA 223"}
                };

                // Display in tabular format
                System.out.println("-----------------------------------------------------");
                System.out.println("| Airline           | Flight Number |");
                System.out.println("-----------------------------------------------------");

                for (String[] flight : flights) {
                    String airline = flight[0];
                    String flightNumber = flight[1];
                    System.out.printf("| %-18s | %-13s |\n", airline, flightNumber);
                }

                System.out.println("-----------------------------------------------------");
                System.out.println("Enter {1,2,3} For Choosing Your Particular Flight ");
                int flight_international_india_to_us = sc.nextInt();
                if (flight_international_india_to_us == 1) {
                    System.out.println("Enter 1 For Economy Class Per Passenger Rs 50,000 !");
                    System.out.println("Enter 2 For First-Class Per Passenger   Rs 80,000 !");
                    System.out.println("Enter 3 For Business Class Per Passenger Rs 130,000!");
                    int luxury_mode_selection = sc.nextInt();
                    if (luxury_mode_selection == 1) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 50000) + (children_delhi_bengaluru_economy_class * 0.3 * 50000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                    if (luxury_mode_selection == 2) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 80000) + (children_delhi_bengaluru_economy_class * 0.3 * 80000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                    if (luxury_mode_selection == 3) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 130000) + (children_delhi_bengaluru_economy_class * 0.3 * 130000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }

                }
                if (flight_international_india_to_us == 2) {
                    System.out.println("Enter 1 For Economy Class Per Passenger Rs 41,000 !");
                    System.out.println("Enter 2 For First-Class Per Passenger   Rs 69,000 !");
                    System.out.println("Enter 3 For Business Class Per Passenger Rs 120,000!");
                    int luxury_mode_selection = sc.nextInt();
                    if (luxury_mode_selection == 1) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 41000) + (children_delhi_bengaluru_economy_class * 0.3 * 41000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                    if (luxury_mode_selection == 2) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 69000) + (children_delhi_bengaluru_economy_class * 0.3 * 69000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                    if (luxury_mode_selection == 3) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 120000) + (children_delhi_bengaluru_economy_class * 0.3 * 120000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                }
                if (flight_international_india_to_us == 3) {
                    System.out.println("Enter 1 For Economy Class Per Passenger Rs 47,000 !");
                    System.out.println("Enter 2 For First-Class Per Passenger   Rs 75,000 !");
                    System.out.println("Enter 3 For Business Class Per Passenger Rs 140,000!");
                    int luxury_mode_selection = sc.nextInt();
                    if (luxury_mode_selection == 1) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 47000) + (children_delhi_bengaluru_economy_class * 0.3 * 47000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                    if (luxury_mode_selection == 2) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 1505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 75000) + (children_delhi_bengaluru_economy_class * 0.3 * 75000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                    if (luxury_mode_selection == 3) {
                        System.out.println("Enter The Total Number Of Adults !");
                        int adult_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Total Number Of Children !");
                        int children_delhi_bengaluru_economy_class = sc.nextInt();
                        System.out.println("Enter The Extra Luggage Weight (If Any) Per Kilograms Rs 505 ");
                        int luggage_weight_delhi_bengaluru_economy_weight_charges = sc.nextInt();
                        double total_cost_economy_delhi_bengaluru = (adult_delhi_bengaluru_economy_class * 140000) + (children_delhi_bengaluru_economy_class * 0.3 * 140000) + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505);
                        System.out.println("Total Cost Of Extra Luggage [If Any]" + " " + (luggage_weight_delhi_bengaluru_economy_weight_charges * 1505));
                        System.out.println("Total Cost Of The Flight :-" + " " + total_cost_economy_delhi_bengaluru);
                    }
                }
            }
        }
    }
}
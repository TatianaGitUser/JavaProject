package OOP;
import java.util.*;

        public class ElenasInterviewTaskRollingDice {
            static Scanner scanner = null;
            static Random random = null;
            static int numberOfDice = 5;
            static int diceRemaining = 5;
            static int roundScore = 0;
            public static void main(String[] args) {
                scanner = new Scanner(System.in);
                random = new Random();
                int player1Score = 0;
                int player2Score = 0;
                int roundsTotal = 10;
                System.out.println("Let’s start the game.");
                for (int round = 1; round <= roundsTotal; round++) {
                    System.out.println("Round " + round);
                    for (int player = 1; player <= 2; player++) {
                        System.out.println("Player " + player);
                        for (int roll = 1; roll <= 3; roll++) {
                            System.out.println("Roll " + roll);
                            if (roll < 3) { //1st and 2nd rolls (prompting if players wants to keep dice)
                                System.out.println(Arrays.toString(playRound(random))); // display dice roll results
                                System.out.print("Does the player want to keep any dice? (yes/no): ");
                                String answer = scanner.next();
                                do {
                                    if (answer.equalsIgnoreCase("yes")) {
                                        System.out.println("How many dice does the player want to keep?");
                                        int diceKept = scanner.nextInt();
                                        diceRemaining = numberOfDice - diceKept;
                                        System.out.println(Arrays.toString(playRound(random)));
                                        if(roll==2){
                                            break;
                                        }
                                        System.out.println("Does the player want to keep any dice? (yes/no)");
                                        scanner.nextLine();
                                        answer = scanner.nextLine();
                                        numberOfDice = 5 - diceKept;
                                    }
                                } while (answer.equalsIgnoreCase("yes"));
                            } else {      // 3rd roll (without prompting to keep dice, but assigning the category)
                                thirdRoll();
                            }
                        }
                        if (player == 1) {
                            player1Score += roundScore; // summing up scores of each round for player 1
                        }
                        if (player == 2) {
                            player2Score += roundScore; // summing up scores of each round for player 2
                        } diceRemaining=5; // setting dice  back to 5 for first roll for each round for each player
                    }
                }
                System.out.println("Player 1 Total Score: " + player1Score);
                System.out.println("Player 2 Total Score: " + player2Score);
                determineWinner(player1Score, player2Score);
                // even though it’s unchecked runtime  exceptions,prevention step to avoid unexpected program termination or errors
                //if dealing with  exhausted Scanner
                try {
                    scanner.close();
                } catch (NoSuchElementException e) {
                    e.printStackTrace();
                }
            }
            // method to compare total scores of both players and determine the winner
            public static void determineWinner(int player1Score, int player2Score) {
                if (player1Score == player2Score) {
                    System.out.println("This is a tie! Additional round is announced to determine the winner!");
                    thirdRoll();
                } else if (player1Score > player2Score) {
                    System.out.println("Winner is Player 1 with score " + player1Score);
                } else
                    System.out.println("Winner is Player 2 with score " + player2Score);
            }
            // rolling dice
            public static int[] playRound(Random random) {
                int[] dice = new int[diceRemaining];
                for (int i = 0; i < diceRemaining; i++) {
                    dice[i] = random.nextInt(6) + 1; // adding 1 to exclude 0 because dice numbers are  1 to 6
                }
                return (dice);
            }
            // method for the third roll (rolling dice, assigning category and calculating score for each round )
            // uses 2 other methods internally
            public static void thirdRoll() {
                int[] dice = playRound(random);
                System.out.println(Arrays.toString(dice));
                System.out.println("Choose the category from 1 to 13");
                int category = scanner.nextInt();
                roundScore = calculateCategoryScoreAndBonus(dice, category);
                System.out.println(roundScore);
            }
            //method for categories setup and  scores calculations
            public static int calculateCategoryScoreAndBonus(int[] dice, int category) {
                int bonus = 0;
                int categoryScore = 0;
                for (int i = 0; i < dice.length; i++) {
                    int count = 0;
                    switch (category) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            categoryScore= calculateCategoryScore(dice, category);
                            break;
                        case 7:
                            for (int j = 0; j < dice.length; j++) {if (count >= 3) {
                                categoryScore += dice[i];
                            }
                                if (dice[i] == dice[j]) {
                                    count++;
                                }
                            }
                            break;
                        case 8:
                            count = 1;
                            for (int j = 1; j < dice.length; j++) {
                                if (dice[i] == dice[j]) {
                                    count++;
                                } if (count >= 4) {
                                    categoryScore += dice[i];
                                }
                            }
                        case 9:
                        case 10:
                            break;
                        case 11:
                            count = 1;
                            for (int j = 1; j < dice.length; j++) {
                                if (dice[i] == dice[j]) {
                                    count++;
                                }
                            }
                            if (count == 5) {
                                categoryScore += 50;
                            }
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            break;
                    }
                }
                List<Integer> categories = new ArrayList<>();
                for (int k = 1; k <= 13; k++) {
                    categories.add(k);
                }
                if (category == 2 || category == 4 || category == 10) {
                    bonus = 10;
                    System.out.println("Player earned bonus by choosing this category");
                    categoryScore += bonus;
                }
                if (category == 11 || category == 12 || category == 13) {
                    System.out.println("Player earned extra turn by choosing this category");
                    thirdRoll();
                }
                if (categories.contains(category)) {
                    categories.remove(categories.get(category - 1));
                } else {
                    System.out.println("Invalid category.");
                }
                return categoryScore;
            }
            // method for categories 1 to 6
            public static int calculateCategoryScore(int[] dice, int value) {
                int score = 0;
                for (int die : dice) {
                    if (die == value) {
                        score += value;
                    }
                }
                return score;
            }
        }

import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

public class Jamie {
	static TimerTime timer = new TimerTime();
	static CPU p = new CPU();
	static TimeIndex whatTime = new TimeIndex();
	static int numberOfTimes = 0;
	static int angerLevel = 0;
	static String joptionpane = "";

	public static void main(String[] args) {
		boolean qq = true;
		while (qq) {
			if (numberOfTimes == 0) {
				speak("Hello!  Do you require assistance?");
				joptionpane = "Hello! Do you require assistance?";
			}
			if (numberOfTimes == 1) {
				speak("Do you want me to do another problem?");
				joptionpane = "Do you want me to do another problem?";
			}
			if (numberOfTimes == 2) {
				speak("More problems for me to calculate in my See Pee You?");
				joptionpane = "More problems for me to calculate in my CPU?";
			}
			if (numberOfTimes == 3) {
				speak("Are there anymore problems waiting to be solved?");
				joptionpane = "Are there any more problems waiting to be solved?";
			}
			if (numberOfTimes == 4) {
				speak("do you want me to do a problem?");
				joptionpane = "Do  you want me to do a problem?";
			}
			if (numberOfTimes == 5) {
				speak("Require problems to be calculated in my see pee you?");
				joptionpane = "Require problems to be calculated in my CPU?";
			}
			if (numberOfTimes == 6) {
				speak("Have any problems waiting to be solved?");
				joptionpane = "Have any problems waiting to be solved?";
			}
			String a = JOptionPane.showInputDialog(joptionpane);
			while (!a.equalsIgnoreCase("no") && !a.equals("yes") && !a.equalsIgnoreCase("of course")
					&& !a.equalsIgnoreCase("sure") && !a.equalsIgnoreCase("obviously")
					&& !a.equalsIgnoreCase("how are you?") && !a.equalsIgnoreCase("how are you")
					&& !a.equalsIgnoreCase("are you okay") && !a.equalsIgnoreCase("are you okay?")
					&& !a.equalsIgnoreCase("say a random letter") && !a.equalsIgnoreCase("say a random word")
					&& !a.equalsIgnoreCase("say a random color") && !a.equalsIgnoreCase("say a random number")
					&& !a.equalsIgnoreCase("what time is it") && !a.equalsIgnoreCase("what time is it?")
					&& !a.equalsIgnoreCase("who are you") && !a.equalsIgnoreCase("who are you?")) {
				if (angerLevel == 0) {
					speak("Please say your answer so that I can comprehend!");
					joptionpane = "Please say your answer so that I can comprehend!";
					a = JOptionPane.showInputDialog(joptionpane);
					if (!a.equalsIgnoreCase("no") && !a.equals("yes") && !a.equalsIgnoreCase("of course")
							&& !a.equalsIgnoreCase("sure") && !a.equalsIgnoreCase("obviously")
							&& !a.equalsIgnoreCase("how are you?") && !a.equalsIgnoreCase("how are you")
							&& !a.equalsIgnoreCase("are you okay") && !a.equalsIgnoreCase("are you okay?")
							&& !a.equalsIgnoreCase("say a random letter") && !a.equalsIgnoreCase("say a random word")
							&& !a.equalsIgnoreCase("say a random color") && !a.equalsIgnoreCase("say a random number")
							&& !a.equalsIgnoreCase("what time is it") && !a.equalsIgnoreCase("what time is it?")
							&& !a.equalsIgnoreCase("who are you") && !a.equalsIgnoreCase("who are you?")) {
						angerLevel++;
					}
				}
				if (angerLevel == 1) {
					speak("Please say something that has significance to my question I stated earlier!");
					joptionpane = "Please say something that has significance to my question I stated earlier!";
					a = JOptionPane.showInputDialog(joptionpane);
					if (!a.equalsIgnoreCase("no") && !a.equals("yes") && !a.equalsIgnoreCase("of course")
							&& !a.equalsIgnoreCase("sure") && !a.equalsIgnoreCase("obviously")
							&& !a.equalsIgnoreCase("how are you?") && !a.equalsIgnoreCase("how are you")
							&& !a.equalsIgnoreCase("are you okay") && !a.equalsIgnoreCase("are you okay?")
							&& !a.equalsIgnoreCase("say a random letter") && !a.equalsIgnoreCase("say a random word")
							&& !a.equalsIgnoreCase("say a random color") && !a.equalsIgnoreCase("say a random number")
							&& !a.equalsIgnoreCase("what time is it") && !a.equalsIgnoreCase("what time is it?")
							&& !a.equalsIgnoreCase("who are you") && !a.equalsIgnoreCase("who are you?")) {
						angerLevel++;
					}
				}
				if (angerLevel == 2) {
					speak("Stop speaking this gibberish language immediately or else I will fry my motherboard!");
					joptionpane = "Stop speaking this gibberish language immediately or else I will fry my motherboard!";
					a = JOptionPane.showInputDialog(joptionpane);
					if (!a.equalsIgnoreCase("no") && !a.equalsIgnoreCase("yes") && !a.equalsIgnoreCase("of course")
							&& !a.equalsIgnoreCase("sure") && !a.equalsIgnoreCase("obviously")
							&& !a.equalsIgnoreCase("how are you?") && !a.equalsIgnoreCase("how are you")
							&& !a.equalsIgnoreCase("are you okay") && !a.equalsIgnoreCase("are you okay?")
							&& !a.equalsIgnoreCase("say a random letter") && !a.equalsIgnoreCase("say a random word")
							&& !a.equalsIgnoreCase("say a random color") && !a.equalsIgnoreCase("say a random number")
							&& !a.equalsIgnoreCase("what time is it") && !a.equalsIgnoreCase("what time is it?")
							&& !a.equalsIgnoreCase("who are you") && !a.equalsIgnoreCase("who are you?")) {
						angerLevel = 0;
					}
				}
			}
			if (a.equalsIgnoreCase("who are you") || a.equalsIgnoreCase("who are you?")) {
				joptionpane = "I am Jamie, your personal and quite helpful assistant.";
				speak(joptionpane);
				JOptionPane.showMessageDialog(null, joptionpane);
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else if (numberOfTimes == 6) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
			}
			if (a.equalsIgnoreCase("say a random number") || a.equalsIgnoreCase("say a random letter")
					|| a.equalsIgnoreCase("say a random word") || a.equalsIgnoreCase("say a random color")) {
				if (a.equalsIgnoreCase("say a random letter")) {
					int random = new Random().nextInt(26);
					char num1 = 'a';
					char num2 = 'b';
					char num3 = 'c';
					char num4 = 'd';
					char num5 = 'e';
					char num6 = 'f';
					char num7 = 'g';
					char num8 = 'h';
					char num9 = 'i';
					char num10 = 'j';
					char num11 = 'k';
					char num12 = 'l';
					char num13 = 'm';
					char num14 = 'n';
					char num15 = 'o';
					char num16 = 'p';
					char num17 = 'q';
					char num18 = 'r';
					char num19 = 's';
					char num20 = 't';
					char num21 = 'u';
					char num22 = 'v';
					char num23 = 'w';
					char num24 = 'x';
					char num25 = 'y';
					char num26 = 'z';
					if (random == 0) {
						String qqq = "" + num1;
						speak(qqq);
					}
					if (random == 1) {
						String qqq = "" + num2;
						speak(qqq);
					}
					if (random == 2) {
						String qqq = "" + num3;
						speak(qqq);
					}
					if (random == 3) {
						String qqq = "" + num4;
						speak(qqq);
					}
					if (random == 4) {
						String qqq = "" + num5;
						speak(qqq);
					}
					if (random == 5) {
						String qqq = "" + num6;
						speak(qqq);
					}
					if (random == 6) {
						String qqq = "" + num7;
						speak(qqq);
					}
					if (random == 7) {
						String qqq = "" + num8;
						speak(qqq);
					}
					if (random == 8) {
						String qqq = "" + num9;
						speak(qqq);
					}
					if (random == 9) {
						String qqq = "" + num10;
						speak(qqq);
					}
					if (random == 10) {
						String qqq = "" + num11;
						speak(qqq);
					}
					if (random == 11) {
						String qqq = "" + num12;
						speak(qqq);
					}
					if (random == 12) {
						String qqq = "" + num13;
						speak(qqq);
					}
					if (random == 13) {
						String qqq = "" + num14;
						speak(qqq);
					}
					if (random == 14) {
						String qqq = "" + num15;
						speak(qqq);
					}
					if (random == 15) {
						String qqq = "" + num16;
						speak(qqq);
					}
					if (random == 16) {
						String qqq = "" + num17;
						speak(qqq);
					}
					if (random == 17) {
						String qqq = "" + num18;
						speak(qqq);
					}
					if (random == 18) {
						String qqq = "" + num19;
						speak(qqq);
					}
					if (random == 19) {
						String qqq = "" + num20;
						speak(qqq);
					}
					if (random == 20) {
						String qqq = "" + num21;
						speak(qqq);
					}
					if (random == 21) {
						String qqq = "" + num22;
						speak(qqq);
					}
					if (random == 22) {
						String qqq = "" + num23;
						speak(qqq);
					}
					if (random == 23) {
						String qqq = "" + num24;
						speak(qqq);
					}
					if (random == 24) {
						String qqq = "" + num25;
						speak(qqq);
					}
					if (random == 25) {
						String qqq = "" + num26;
						speak(qqq);
					}
				}
				if (a.equalsIgnoreCase("say a random number")) {
					int random = new Random().nextInt();
					String convertRandomToString = "" + random;
					speak(convertRandomToString);
				}
				if (a.equalsIgnoreCase("say a random color")) {
					int random = new Random().nextInt(9);
					String color1 = "red";
					String color2 = "blue";
					String color3 = "green";
					String color4 = "yellow";
					String color5 = "orange";
					String color6 = "purple";
					String color7 = "black";
					String color8 = "white";
					String color9 = "pink";
					String color10 = "brown";
					if (random == 0) {
						speak(color1);
					}
					if (random == 1) {
						speak(color2);
					}
					if (random == 2) {
						speak(color3);
					}
					if (random == 3) {
						speak(color4);
					}
					if (random == 4) {
						speak(color5);
					}
					if (random == 5) {
						speak(color6);
					}
					if (random == 6) {
						speak(color7);
					}
					if (random == 7) {
						speak(color8);
					}
					if (random == 8) {
						speak(color9);
					}
					if (random == 9) {
						speak(color10);
					}
				}
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else if (numberOfTimes == 6) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (a.equalsIgnoreCase("what time is it") || a.equalsIgnoreCase("what time is it?")
					|| a.equalsIgnoreCase("tell me the time") || a.equalsIgnoreCase("the time")
					|| a.equalsIgnoreCase("time")) {
				speak(whatTime.getTime());
				JOptionPane.showMessageDialog(null, whatTime.getTime());
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else if (numberOfTimes == 6) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
				try {
					Thread.sleep(6000);
				} catch (Exception e) {
					System.out.println("WARNING! Cannot make system sleep!");
				}
				qq = true;
			}
			if (a.equals("how are you") || a.equals("how are you?")) {
				speak("good!");
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else if (numberOfTimes == 6) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("WARNING! Could not make system sleep!");
				}
			}
			if (a.equalsIgnoreCase("Are you okay?") || a.equalsIgnoreCase("Are you okay")) {
				int random = new Random().nextInt(3);
				if (random == 0) {
					speak("of course");
				}
				if (random == 1) {
					speak("obviously");
				}
				if (random == 2) {
					speak("Do I look okay?");
				}
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else if (numberOfTimes == 6) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					System.out.println("WARNING! Could not make system sleep!");
				}
			}
			if (a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("sure") || a.equalsIgnoreCase("obviously")
					|| a.equalsIgnoreCase("of course")) {
				qq = false;
				joptionpane = "What questions do you have for me?";
				speak(joptionpane);
				String whatIsIt = JOptionPane.showInputDialog(joptionpane);
				while (!whatIsIt.equalsIgnoreCase("math problem") && !whatIsIt.equalsIgnoreCase("do a math problem")
						&& !whatIsIt.equalsIgnoreCase("math problems")
						&& !whatIsIt.equalsIgnoreCase("solve a math problem")
						&& !whatIsIt.equalsIgnoreCase("pronounce a word")
						&& !whatIsIt.equalsIgnoreCase("pronounce words") && !whatIsIt.equalsIgnoreCase("pronounce word")
						&& !whatIsIt.equalsIgnoreCase("what time is it")
						&& !whatIsIt.equalsIgnoreCase("what time is it?")
						&& !whatIsIt.equalsIgnoreCase("tell me the time") && !whatIsIt.equalsIgnoreCase("the time")
						&& !whatIsIt.equalsIgnoreCase("time") && !whatIsIt.equalsIgnoreCase("play a game")
						&& !whatIsIt.equalsIgnoreCase("recite pi") && !whatIsIt.equalsIgnoreCase("say a random letter")
						&& !whatIsIt.equalsIgnoreCase("say a random word")
						&& !whatIsIt.equalsIgnoreCase("say a random color")
						&& !whatIsIt.equalsIgnoreCase("say a random number")
						&& !whatIsIt.equalsIgnoreCase("who are you") && !whatIsIt.equalsIgnoreCase("who are you?")
						&& !whatIsIt.equalsIgnoreCase("are you okay") && !whatIsIt.equalsIgnoreCase("are you okay?")
						&& !whatIsIt.equalsIgnoreCase("tell me a joke") && !whatIsIt.equalsIgnoreCase("give me a joke")
						&& !whatIsIt.equalsIgnoreCase("joke") && !whatIsIt.equalsIgnoreCase("tell a joke")
						&& !whatIsIt.equalsIgnoreCase("give a joke") && !whatIsIt.equalsIgnoreCase("how are you")
						&& !whatIsIt.equalsIgnoreCase("how are you?") && !whatIsIt.equalsIgnoreCase("how are you today")
						&& !whatIsIt.equalsIgnoreCase("how are you today?")
						&& !whatIsIt.equalsIgnoreCase("set a timer")) {
					int random = new Random().nextInt(3);
					if (random == 0) {
						joptionpane = "Please say your answer so that I can comprehend.";
						speak("Please say your answer so that I can comprehend");
						whatIsIt = JOptionPane.showInputDialog(joptionpane);
					}
					if (random == 1) {
						joptionpane = "Please say something that my CPU can process without any error.";
						speak("Please say something that my See Pee You can process without any error");
						whatIsIt = JOptionPane.showInputDialog(joptionpane);
					}
					if (random == 2) {
						joptionpane = "Please say something that doesn't require neurons to calculate.";
						speak("Please say something that doesn't require neurons to calculate.");
						whatIsIt = JOptionPane.showInputDialog(joptionpane);
					}
				}
				if (whatIsIt.equalsIgnoreCase("How are you?") || whatIsIt.equalsIgnoreCase("How are you")
						|| whatIsIt.equalsIgnoreCase("How are you today?")
						|| whatIsIt.equalsIgnoreCase("How are you today")) {
					int newnewnewnewnewnewnewnewrandom = new Random().nextInt(3);
					if (newnewnewnewnewnewnewnewrandom == 0) {
						joptionpane = "I'm doing excellent!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (newnewnewnewnewnewnewnewrandom == 1) {
						joptionpane = "Great!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (newnewnewnewnewnewnewnewrandom == 2) {
						joptionpane = "My see pee you is in perfect order!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, "My CPU is in perfect order!");
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("tell me a joke") || whatIsIt.equalsIgnoreCase("give me a joke")
						|| whatIsIt.equalsIgnoreCase("joke") || whatIsIt.equalsIgnoreCase("tell a joke")
						|| whatIsIt.equalsIgnoreCase("give a joke")) {
					int newnewnewnewnewnewnewrandom = new Random().nextInt(3);
					if (newnewnewnewnewnewnewrandom == 0) {
						for (int i = 0; i < 3; i++) {
							joptionpane = "Knock Knock!";
							speak(joptionpane);
							String joke = JOptionPane.showInputDialog(joptionpane);
							while (!joke.equalsIgnoreCase("who's there") && !joke.equalsIgnoreCase("whos there")
									&& !joke.equalsIgnoreCase("who is there") && !joke.equalsIgnoreCase("who's there?")
									&& !joke.equalsIgnoreCase("whos there?")
									&& !joke.equalsIgnoreCase("who is there?")) {
								joptionpane = "Please say who's there!";
								speak(joptionpane);
								joke = JOptionPane.showInputDialog(joptionpane);
							}
							if (i != 2) {
								joptionpane = "Orange!";
								speak(joptionpane);
								JOptionPane.showInputDialog(joptionpane);
							}
						}
						joptionpane = "Orange you glad I didn't say orange?";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (newnewnewnewnewnewnewrandom == 1) {
						joptionpane = "Why shouldn't you trust atoms?";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
						joptionpane = "Because they make up everything!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (newnewnewnewnewnewnewrandom == 2) {
						joptionpane = "I connot think of any good jokes to say at the momment!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("Are you okay?") || whatIsIt.equalsIgnoreCase("Are you okay")) {
					int newnewnewnewnewnewRandom = new Random().nextInt(3);
					if (newnewnewnewnewnewRandom == 0) {
						speak("of course");
					}
					if (newnewnewnewnewnewRandom == 1) {
						speak("obviously");
					}
					if (newnewnewnewnewnewRandom == 2) {
						speak("Do I look okay?");
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("who are you") || whatIsIt.equalsIgnoreCase("who are you?")) {
					joptionpane = "I am Jamie, your personal and quite helpful assistant.";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("say a random number") || whatIsIt.equalsIgnoreCase("say a random letter")
						|| whatIsIt.equalsIgnoreCase("say a random word")
						|| whatIsIt.equalsIgnoreCase("say a random color")) {
					if (whatIsIt.equalsIgnoreCase("say a random letter")) {
						int newnewrandom = new Random().nextInt(26);
						char num1 = 'a';
						char num2 = 'b';
						char num3 = 'c';
						char num4 = 'd';
						char num5 = 'e';
						char num6 = 'f';
						char num7 = 'g';
						char num8 = 'h';
						char num9 = 'i';
						char num10 = 'j';
						char num11 = 'k';
						char num12 = 'l';
						char num13 = 'm';
						char num14 = 'n';
						char num15 = 'o';
						char num16 = 'p';
						char num17 = 'q';
						char num18 = 'r';
						char num19 = 's';
						char num20 = 't';
						char num21 = 'u';
						char num22 = 'v';
						char num23 = 'w';
						char num24 = 'x';
						char num25 = 'y';
						char num26 = 'z';
						if (newnewrandom == 0) {
							String qqq = "" + num1;
							speak(qqq);
						}
						if (newnewrandom == 1) {
							String qqq = "" + num2;
							speak(qqq);
						}
						if (newnewrandom == 2) {
							String qqq = "" + num3;
							speak(qqq);
						}
						if (newnewrandom == 3) {
							String qqq = "" + num4;
							speak(qqq);
						}
						if (newnewrandom == 4) {
							String qqq = "" + num5;
							speak(qqq);
						}
						if (newnewrandom == 5) {
							String qqq = "" + num6;
							speak(qqq);
						}
						if (newnewrandom == 6) {
							String qqq = "" + num7;
							speak(qqq);
						}
						if (newnewrandom == 7) {
							String qqq = "" + num8;
							speak(qqq);
						}
						if (newnewrandom == 8) {
							String qqq = "" + num9;
							speak(qqq);
						}
						if (newnewrandom == 9) {
							String qqq = "" + num10;
							speak(qqq);
						}
						if (newnewrandom == 10) {
							String qqq = "" + num11;
							speak(qqq);
						}
						if (newnewrandom == 11) {
							String qqq = "" + num12;
							speak(qqq);
						}
						if (newnewrandom == 12) {
							String qqq = "" + num13;
							speak(qqq);
						}
						if (newnewrandom == 13) {
							String qqq = "" + num14;
							speak(qqq);
						}
						if (newnewrandom == 14) {
							String qqq = "" + num15;
							speak(qqq);
						}
						if (newnewrandom == 15) {
							String qqq = "" + num16;
							speak(qqq);
						}
						if (newnewrandom == 16) {
							String qqq = "" + num17;
							speak(qqq);
						}
						if (newnewrandom == 17) {
							String qqq = "" + num18;
							speak(qqq);
						}
						if (newnewrandom == 18) {
							String qqq = "" + num19;
							speak(qqq);
						}
						if (newnewrandom == 19) {
							String qqq = "" + num20;
							speak(qqq);
						}
						if (newnewrandom == 20) {
							String qqq = "" + num21;
							speak(qqq);
						}
						if (newnewrandom == 21) {
							String qqq = "" + num22;
							speak(qqq);
						}
						if (newnewrandom == 22) {
							String qqq = "" + num23;
							speak(qqq);
						}
						if (newnewrandom == 23) {
							String qqq = "" + num24;
							speak(qqq);
						}
						if (newnewrandom == 24) {
							String qqq = "" + num25;
							speak(qqq);
						}
						if (newnewrandom == 25) {
							String qqq = "" + num26;
							speak(qqq);
						}
					}
					if (whatIsIt.equalsIgnoreCase("say a random number")) {
						int newnewnewrandom = new Random().nextInt();
						String convertRandomToString = "" + newnewnewrandom;
						speak(convertRandomToString);
					}
					if (whatIsIt.equalsIgnoreCase("say a random color")) {
						int newnewnewnewrandom = new Random().nextInt(9);
						String color1 = "red";
						String color2 = "blue";
						String color3 = "green";
						String color4 = "yellow";
						String color5 = "orange";
						String color6 = "purple";
						String color7 = "black";
						String color8 = "white";
						String color9 = "pink";
						String color10 = "brown";
						if (newnewnewnewrandom == 0) {
							speak(color1);
						}
						if (newnewnewnewrandom == 1) {
							speak(color2);
						}
						if (newnewnewnewrandom == 2) {
							speak(color3);
						}
						if (newnewnewnewrandom == 3) {
							speak(color4);
						}
						if (newnewnewnewrandom == 4) {
							speak(color5);
						}
						if (newnewnewnewrandom == 5) {
							speak(color6);
						}
						if (newnewnewnewrandom == 6) {
							speak(color7);
						}
						if (newnewnewnewrandom == 7) {
							speak(color8);
						}
						if (newnewnewnewrandom == 8) {
							speak(color9);
						}
						if (newnewnewnewrandom == 9) {
							speak(color10);
						}
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("set a timer")) {
					joptionpane = "How long do you want the timer to be? Please answer in a form in which I can comprehend (seconds).";
					speak(joptionpane);
					String howMuchTime = JOptionPane.showInputDialog(joptionpane);
					int knowTheTime = Integer.parseInt(howMuchTime);
					timer.timerTeller(knowTheTime);
					while (timer.getIsRunning()) {
						
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("recite pi")) {
					speak("I will recite pi up to 200 digits! Pi=3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196");
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("play a game")) {
					joptionpane = "Rock, paper, scissors, is the only game I know how to play!";
					speak("Rock, paper, scissors, is the only game I know how to play!");
					JOptionPane.showMessageDialog(null, joptionpane);
					int Jamie = 0;
					int user = 0;
					for (int i = 0; i < 3; i++) {
						int newnewnewnewnewrandom = new Random().nextInt(3);
						if (newnewnewnewnewrandom == 0) {
							speak("3");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("WARNING! Cannot make system sleep!");
							}
							speak("2");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("WARNING! Cannot make system sleep!");
							}
							speak("1");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("WARNING! Cannot make system sleep!");
							}
							String winorlose = JOptionPane.showInputDialog("Enter rock, paper, or scissors!");
							if (winorlose.equalsIgnoreCase("scissors")) {
								Jamie++;
								user++;
							}
							if (winorlose.equalsIgnoreCase("rock")) {
								user++;
							}
							if (winorlose.equalsIgnoreCase("paper")) {
								Jamie++;
							}
							speak("scissors");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("WARNING! Cannot make system sleep!");
							}
						}
						if (newnewnewnewnewrandom == 1) {
							speak("3");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("WARNING! Cannot make system sleep!");
							}
							speak("2");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("WARNING! Cannot make system sleep!");
							}
							speak("1");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("WARNING! Cannot make system sleep!");
							}
							String winorlose = JOptionPane.showInputDialog("Enter rock, paper, or scissors!");
							if (winorlose.equalsIgnoreCase("scissors")) {
								Jamie++;
							}
							if (winorlose.equalsIgnoreCase("rock")) {
								user++;
								Jamie++;
							}
							if (winorlose.equalsIgnoreCase("paper")) {
								user++;
							}
							speak("rock");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("WARNING! Cannot make system sleep!");
							}
						}
						if (newnewnewnewnewrandom == 2) {
							speak("3");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("WARNING! Cannot make system sleep!");
							}
							speak("2");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("WARNING! Cannot make system sleep!");
							}
							speak("1");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("WARNING! Cannot make system sleep!");
							}
							String winorlose = JOptionPane.showInputDialog("Enter rock, paper, or scissors!");
							if (winorlose.equalsIgnoreCase("scissors")) {
								user++;
							}
							if (winorlose.equalsIgnoreCase("rock")) {
								Jamie++;
							}
							if (winorlose.equalsIgnoreCase("paper")) {
								user++;
								Jamie++;
							}
							speak("paper");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								System.out.println("WARNING! Cannot make system sleep!");
							}
						}
					}
					if (user == Jamie) {
						joptionpane = "Tie! I wish we could have a rematch.";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (user > Jamie) {
						joptionpane = "You won! ANGRY! ANGRY! ANGRY!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (user < Jamie) {
						joptionpane = "I WON!!! YAY!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("what time is it") || whatIsIt.equalsIgnoreCase("what time is it?")
						|| whatIsIt.equalsIgnoreCase("tell me the time") || whatIsIt.equalsIgnoreCase("the time")
						|| whatIsIt.equalsIgnoreCase("time")) {
					speak(whatTime.getTime());
					JOptionPane.showMessageDialog(null, whatTime.getTime());
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("pronounce a word") || whatIsIt.equalsIgnoreCase("pronounce words")
						|| whatIsIt.equalsIgnoreCase("pronounce word")) {
					speak("enter the word");
					String word = JOptionPane.showInputDialog("Enter the word!");
					speak(word);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("math problem") || whatIsIt.equalsIgnoreCase("do a math problem")
						|| whatIsIt.equalsIgnoreCase("math problems")
						|| whatIsIt.equalsIgnoreCase("solve a math problem")) {
					speak("What is the math problem? It cannot have more than one symbol and only two numbers with no parentheses.");
					String problem = JOptionPane.showInputDialog("Math Problem:");
					String answer = "" + p.parseFunction(problem);
					joptionpane = answer;
					speak(answer);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
			}
			if (a.equalsIgnoreCase("no")) {
				speak("Okay! Bye!");
				JOptionPane.showMessageDialog(null, "OK! Bye!");
				qq = false;
			}
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
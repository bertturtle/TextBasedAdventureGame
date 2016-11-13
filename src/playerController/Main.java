package playerController;

import java.util.ArrayList;
import java.util.List;
import playerResources.GenericResource;
import popupController.ImprovedJFrame;

public class Main {

	static GenericResource banana;
	public static int buttonPressed = 0;
	public static List<GenericResource> resourceList = new ArrayList<GenericResource>();
	static String title = "Adventure of a Lifetime";
	static ImprovedJFrame adventureDialog;

	public static void main(String[] args) {
		adventureDialog = new ImprovedJFrame(title,
				"Hello, and welcome to this adventure. You are a scientist at a zoo in Cincinnati. Just yesterday, a gorilla was shot dead, causing great outrage throughout the country. You job is to find and combine ingredients to make a serum that will revive this gorilla. Good luck.");

		while (buttonPressed == 0) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		startMission();
		// banana = new GenericResource("Banana", 5, "");
		//
		// List<GenericResource> resources = new ArrayList<GenericResource>();
		// resources.add(banana);
		//
		// List<Integer> resourceChange = new ArrayList<Integer>();
		// resourceChange.add(3);
		//
		// List<Integer> resourceChange2 = new ArrayList<Integer>();
		// resourceChange2.add(-banana.getResourceQuantity());
		//
		// List<GenericCommand> possibleActions = new
		// ArrayList<GenericCommand>();
		// possibleActions.add(new GenericCommand("talk", "communicate", new
		// CommandActions(resources, resourceChange), "You talk to the gorilla
		// and he gives you some bananas."));
		// possibleActions.add(new GenericCommand("attack", "fight", new
		// CommandActions(resources, resourceChange2), "You fight the gorrila
		// and lose, because he is a gorilla. He take all of your bananas,
		// because again he is a gorilla."));
		// GenericSituation situation = new GenericSituation("You run into a
		// gorrila", possibleActions);
		// System.out.println(situation.startSituation());
	}

	public static void startMission() {
		adventureDialog.setText(title,
				"Boss: “Here’s a list of the ingredients and where they come from. You’re up for this challenge, right?” What is your response?",
				"“No boss, sorry.”", "“Heck yeah! Revive Harambe!”", "");
		while (buttonPressed == 0) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (buttonPressed == 1) {
			adventureDialog.showDescriptiveDialog("You got killed by an angry mob once you stepped outside.", true);
		} else if (buttonPressed == 2) {
			adventureDialog.showDescriptiveDialog("Boss: “Good luck! Here is a list of all the ingedients”", false);
			while (buttonPressed == 0) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			adventureDialog.setText(title,
					"Your first task is to find the biggest banana in the world, which is located in Honduras. Unfortunately, the language of Honduras is Spanish, and you do not remember it too well from high school. Your plane has landed. What should you do?",
					"Talk to the natives and try to get them to help me.",
					"Find someone who speaks English and Spanish. It may take a lot of time and money, especially because this is a really shady airport (Cincinnati budget cuts).",
					"");
			while (buttonPressed == 0) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (buttonPressed == 1) {
				adventureDialog.setText(title,
						"Your trash Spanish gets you mugged and they take the ingredient list. What do you do next?",
						"Go back to the boss and get another ingredient list.",
						"I never liked Harambe. I’m just going to go home and take a nap.", "");
				while (buttonPressed == 0) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (buttonPressed == 1) {
					adventureDialog.showDescriptiveDialog("Your journey continues due to your resilience.", false);
					while (buttonPressed == 0) {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					startMission();
				} else if (buttonPressed == 2) {
					adventureDialog.showDescriptiveDialog(
							"On your way back to the airport, the gang who mugged you sees you in the taxi. It turns out they are part of a Honduran Cartel, and they take you prisoner for ransom. Cincinnati pays the ransom to get you back but you are killed by an angry mob upon arrival of the US.",
							true);
				}
			} else if (buttonPressed == 2) {
				adventureDialog.showDescriptiveDialog(
						"Even though it took all day, you finally found someone who speaks both languages and offers to help. He even offers you a place to spend the night plus some food.",
						false);
				while (buttonPressed == 0) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				adventureDialog.setText(title,
						"The next morning, you awake to the sound of a police alarm outside the door. Turns out, the guy who offered to help was actually in infamous drug dealer, and he just got caught in the act. The police traced him back to his house, where you are sleeping. What should you do now?",
						"Try to make a run for it. There is a forest pretty close, so maybe I can lose them in there.",
						"Surrender to the police. I’ll just tell them my circumstances and maybe they’ll let me go. ",
						"");
				while (buttonPressed == 0) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (buttonPressed == 1) {
					adventureDialog.setText(title,
							"The police chase after you and try to shoot at you. Luckily, their shots only graze you, however, you are still bleeding. What should you do?",
							"Forge on through the forest. Maybe I will come across a town who can help with my wounds.",
							"Surrender to the police. Maybe they won’t shoot at me.", "");
					while (buttonPressed == 0) {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (buttonPressed == 1) {
						adventureDialog.showDescriptiveDialog(
								"As you continue through the forest, you come across some poisonous snakes. They bite you until you are unable to move. Then, an angry mob of crocodiles shows up that kills and eats you.",
								true);
					} else if (buttonPressed == 2) {
						adventureDialog.showDescriptiveDialog("They shoot at you and you die.", true);
					}
				} else if (buttonPressed == 2) {
					adventureDialog.showDescriptiveDialog(
							"The police take you to the jail. You tell them your story and mission, but they do not seem to feel sympathetic. Then, the main boss guy shows up and says he once visited the Cincinnati zoo, and he decides to free you in order to fulfill your mission. He even offers to help find the place where the biggest banana in the world is being held.",
							false);
					while (buttonPressed == 0) {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					adventureDialog.setText(title,
							"It turns out that the boss guy had lots of connections to people, and they were able to track down the banana to a tribe deep in the forest. When you get there, you see the banana at the top of the tribe’s temple. What should you do?",
							"Try to communicate with the tribe. Even though my Spanish may not be the best, it’s better than stealing the banana and having the tribe get angry and shoot arrows at me.",
							"Try to run up and steal the banana.",
							"");
					while (buttonPressed == 0) {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (buttonPressed == 1) {
						adventureDialog.showDescriptiveDialog(
								"Turns out the tribe doesn’t speak Spanish because they haven’t been exposed to the Spaniards. Then, you say a word that deeply offends them, and they take you prisoner to be sacrificed to the gods.",
								true);
					} else if (buttonPressed == 2) {
						adventureDialog.showDescriptiveDialog(
								"Feeling like Emmitt Smith, you are able to find you way out of the jungle and hitchhike to the airport. From there, you take a flight back to Cincinnati where the banana is safely stored in a room. ",
								false);
						while (buttonPressed == 0) {
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						adventureDialog.setText(title,
								"Your next task is to go to Egypt and find the everlasting gobstopper that literally lasts forever. This time you were smart enough to bring an archeologist and a translator. Upon arrival, you ask all of the locals where you can find the everlasting gobstopper. No one knows for sure, but they direct you to the Egyptian archives. At the Egyptian archives, you accidentally stumble across a hidden room full of ancient texts. After carefully translating some of the texts, you find that the gobstopper is hidden in the sphinx.You then travel to the sphinx, only to find security. Luckily, your archaeologist friend was able to talk it out with the security and you were able to get inside the sphinx. Although you find the gobstopper, there is a giant sleeping sphinx guarding it. The sphinx then wakes up and asks you a riddle.",
								"Try to answer the question but risk death because if you get the answer wrong the sphinx will send you to the underworld",
								"Try to kill the sphinx. Even though the chances are really slim this would make a really cool story to tell the boss.",
								"");
						while (buttonPressed == 0) {
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						if (buttonPressed == 1) {
							adventureDialog.showDescriptiveDialog(
									"The question is really hard, and your archeologist friend is unable to answer it. Both you and the archeologist are sent to the underworld, where you are unable to escape.",
									true);
						} else if (buttonPressed == 2) {
							adventureDialog.showDescriptiveDialog(
									"Turns out the sphinx cannot die because it is immortal, and this stupidity on your part causes the sphinx to laugh uncontrollably. During the time the sphinx could not contain its laughter, you were able to sneak past and take the gobstopper. After leaving Egypt, you put the gobstopper into a safe at the zoo.",
									false);
							while (buttonPressed == 0) {
								try {
									Thread.sleep(200);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
							adventureDialog.setText(title,
									"The next ingredient is a voodoo necklace from Louisiana. On your way there, you decide to take a boat to get around. On the boat, you happen to see a voodoo man wearing a magic necklace. What should you do now?",
									"Talk to the voodoo man. Hopefully he is nice and will take some cash in exchange for his necklace.",
									"Steal the necklace when he is sleeping.", "");
							while (buttonPressed == 0) {
								try {
									Thread.sleep(200);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
							if (buttonPressed == 1) {
								adventureDialog.showDescriptiveDialog(
										"Turns out he is a really nice person, and you become instant friends while talking about fantasy football. He even agrees to give you the necklace for free.",
										false);
								while (buttonPressed == 0) {
									try {
										Thread.sleep(200);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
								adventureDialog.setText(title,
										"After getting the necklace, you decide you need a break to party. While partying, the small tribe from Honduras shows up and holds the party-goers hostage until you surrender. What should you do?",
										"Turn myself in. Maybe they will be merciful, but at least the people at the party will be safe.",
										"Run away. Harambe is definitely more important than a few party people.",
										"Use the voodoo necklace to trap all of the tribe members. Even though there are way too many tribe members and it probably won’t work, it’s worth a chance.");
								while (buttonPressed == 0) {
									try {
										Thread.sleep(200);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
								if (buttonPressed == 1) {
									adventureDialog.showDescriptiveDialog("The tribe sacrifices you to the gods.",
											true);
								} else if (buttonPressed == 2) {
									adventureDialog.showDescriptiveDialog(
											"You are able to escape, but you have a guilty conscience over your head that stays with you for the rest of your life because all of the party-goers are sacrificed to the gods. Your journey continues, though.",
											false);
									while (buttonPressed == 0) {
										try {
											Thread.sleep(200);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
									}
									continueAdventure();
								} else if (buttonPressed == 3) {
									adventureDialog.setText(title,
											"Somehow, it works, but the necklace is destroyed in the process. You look for the voodoo man again, and find him near a river. He was able to fend off the tribe, but not after he suffered multiple wounds. He tells you that his wounds are cannot be healed. What should you do?",
											"Directly ask for another necklace",
											"Try to rush him to a hospital, even though it may be impossible to heal him.",
											"");
									while (buttonPressed == 0) {
										try {
											Thread.sleep(200);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
									}
									if (buttonPressed == 1) {
										adventureDialog.showDescriptiveDialog(
												"The voodoo man becomes outraged at your ungratefulness and kills you with his last bit of magic.",
												true);
									} else if (buttonPressed == 2) {
										adventureDialog.showDescriptiveDialog(
												"He refuses to be moved, because it has always been his destiny to die by a river. However, with his last bit of magic, he is able to craft another necklace. You bring this necklace back to Cincinnati.",
												false);
										while (buttonPressed == 0) {
											try {
												Thread.sleep(200);
											} catch (InterruptedException e) {
												e.printStackTrace();
											}
										}
										continueAdventure();
									}
								}
							} else if (buttonPressed == 2) {
								adventureDialog.showDescriptiveDialog(
										"The moment you touch his necklace, you transport into the necklace and become trapped forever.",
										true);
							}
						}
					}
				}
			}
		}
	}

	public static void continueAdventure() {
		adventureDialog.setText(title,
				"You fly to India the next day to find the next ingredient, which is the hottest ghost pepper in the world. After talking with some of the locals, they point you to the top of the highest mountain. Unfortunately, you have no experience in climbing mountains. Fortunately, you meet a decently experienced mountain guide who is able to guide you up the mountain. Unfortunately, he charges unreasonably high prices for his level of guidance. Fortunately, you were able to get money from the voodoo man. As you climb up the mountain, you meet a hermit. What should you do?",
				"Talk to him. He looks like he knows his way around so maybe he can help us get to the top.",
				"Ignore him because he looks pretty sketchy and weird.", "");
		while (buttonPressed == 0) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (buttonPressed == 1) {
			adventureDialog.setText(title,
					"He decides to join the journey to the top. However, as you continue up the mountain, you realize how annoying he is. What should you do?",
					"Throw him off the first cliff you find", "Deal with his annoyingness.", "");
			while (buttonPressed == 0) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (buttonPressed == 1) {
				adventureDialog.showDescriptiveDialog(
						"You are able to climb the mountain faster than before and secure the ghost pepper. You return to Cincinnati safely.",
						false);
				while (buttonPressed == 0) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				continueStoryMore();
			} else if (buttonPressed == 2) {
				adventureDialog.showDescriptiveDialog(
						"Once you get in sight of the ghost pepper, the hermit rushes by you and you fall off the mountain to your death.",
						true);
			}
		} else if (buttonPressed == 2) {
			adventureDialog.setText(title,
					"Turns out he is sketchy and weird. Even worse, he starts to follow you up the mountain. What should you do?",
					"Ambush him as he gets closer and throw him off the cliff.",
					"Ignore him because you want to focus on your mission.", "");
			while (buttonPressed == 0) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (buttonPressed == 1) {
				adventureDialog.showDescriptiveDialog(
						"You are able to climb the mountain faster than before and secure the ghost pepper. You return to Cincinnati safely. At Cincinnati, you round up all of the collected ingredients and take them with you because there could be some possible legal issues in killing the hermit.",
						false);
				while (buttonPressed == 0) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				continueStoryMore();
			} else if (buttonPressed == 2) {
				adventureDialog.showDescriptiveDialog(
						"As you get to the top of the mountain and in sight of the ghost pepper, the hermit rushes by you and you fall off the mountain to your death.",
						true);
			}
		}
	}

	public static void continueStoryMore() {
		adventureDialog.setText(title,
				"You travel to the Vatican City in Rome to find the next ingredient, the oldest wine in the world. You bring your friend who can speak Italian to translate for the both of you. When you get there, you decide to do a little sightseeing and check out the Coliseum. Coincidentally, your friend starts talking to a priest from the Vatican. You then ask to check out the wine cellar because you pretend to be a wine aficionado. Down in the cellars, you see what the priest claims to be the oldest wine in the world. What should you do?",
				"Ask nicely for the wine. The priest seems like a pretty chill dude, so maybe he’ll understand that this is for a great cause.",
				"Take the wine and run. Maybe the police will be slow to catch up since you’ve spent a lot of time lately running away from people.",
				"");
		while (buttonPressed == 0) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (buttonPressed == 1) {
			adventureDialog.showDescriptiveDialog(
					"The priest scornfully rejects the request and banishes them from the Vatican for life. As you go outside, you meet an angry mob that is mad that you disrespected their old wine. They trample you over until you are unable to walk again.",
					true);
		} else if (buttonPressed == 2) {
			adventureDialog.setText(title,
					"You are able to steal the wine and get away, but you become an enemy of the country. You must get away quickly, and the only return is to escape to Cincinnati illegally. As you arrive at Cincinnati, you are stopped because you have a bottle of wine. What should you do?",
					"Run away again. You’re legs feel like the best they’ve felt in forever.",
					"Hand the wine over because there is no running away from the police this time.", "");
			while (buttonPressed == 0) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (buttonPressed == 1) {
				adventureDialog.showDescriptiveDialog("You are able escape the country somehow.", false);
				while (buttonPressed == 0) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				adventureDialog.setText(title,
						"After escaping the country, you head over to Easter Island to find the magic bunny. You ask around seeing if anyone knows anything about the magic bunny. No one seems to know anything. However, an old man apparently hears you asking around and motions you to walk over to him. What should you do?",
						"Ignore him. He looks a little creepy and I would rather ask other people.",
						"Go over to him and see what he says.", "");
				while (buttonPressed == 0) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (buttonPressed == 1) {
					adventureDialog.showDescriptiveDialog(
							"Turns out the old man has really bad anger issues. When you ignore him, he gets mad, pulls out a knife, and stabs you until you are unable to move again.",
							true);
				} else if (buttonPressed == 2) {
					adventureDialog.showDescriptiveDialog(
							"He actually knows a lot about the island and tells you to go over to the Moai, which are huge monolithic human figures that were carved by an ancient Polynesian tribe.",
							false);
					while (buttonPressed == 0) {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					adventureDialog.setText(title,
							"Upon arriving at the statue, you see an enormous hole in the middle of all the Moai. However, security has surrounded the statues, making it hard to enter the area. What should you do?",
							"Try to sneak past the guards. They don’t look too fit, and I could probably outrun them. ",
							"Try to wait out the security guards. Maybe they’ll get bored and I’ll be able to sneak by.",
							"Talk to the security guards. They look like cool guys, maybe they will let me go by if I make friends with them and tell them of my situation.");
					while (buttonPressed == 0) {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (buttonPressed == 1) {
						adventureDialog.showDescriptiveDialog(
								"The guards see you and chase you. Turns out they are faster than they look. You are caught and thrown into prison, where you are also convicted of your international crimes. You are put into jail for a long time.",
								true);
					} else if (buttonPressed == 2) {
						adventureDialog.showDescriptiveDialog(
								"You would have to wait forever because these security guards never get distracted. Because you are taking so long to get the bunny hair, a mob of people get angry and trample you over until you are unable to walk.",
								true);
					} else if (buttonPressed == 3) {
						adventureDialog.showDescriptiveDialog(
								"Turns out the security guards are huge fans of Harambe and they let you pass.", false);
						while (buttonPressed == 0) {
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						adventureDialog.setText(title,
								"You hop into the hole and continue your search for the bunny. When you get into the hole, you find three different paths. Which one do you pick?",
								"Left, which smells like food.",
								"Middle, which has a bunch of footsteps on the ground leading into it.",
								"Right, which has a light at the end of it.");
						while (buttonPressed == 0) {
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						if (buttonPressed == 1) {
							adventureDialog.showDescriptiveDialog(
									"You follow this path, where you fall into the pit where the bunny stores its food and prisoners. You are trapped here until you run and of food and starve to death.",
									true);
						}
						if (buttonPressed == 2) {
							caveStory();
						}
						if (buttonPressed == 3) {
							adventureDialog.showDescriptiveDialog(
									"You follow this path, which leads you to the bunny’s main room.", false);
							while (buttonPressed == 0) {
								try {
									Thread.sleep(200);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
							afterBunnyStory();
						}
					}
				}
			} else if (buttonPressed == 2) {
				adventureDialog.showDescriptiveDialog(
						"As you hand over the wine, an angry mob gets mad at you for giving up so easily, and they trample you until you are unable to walk again.",
						true);
			}
		}
	}

	public static void caveStory() {
		adventureDialog.setText(title,
				"You follow this path until you find another fork in the path with another three tunnels. Which one do you pick?",
				"Left, which smells of food.", "Middle, which has a bright light at the end of it.",
				"Right, which has a light at the end of it.");
		while (buttonPressed == 0) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (buttonPressed == 1) {
			adventureDialog.showDescriptiveDialog(
					"You follow this path, where you fall into the pit where the bunny stores its food and prisoners. You are trapped here until you run and of food and starve to death.",
					true);
		} else if (buttonPressed == 2) {
			adventureDialog.showDescriptiveDialog(
					"You follow this path until you fall down a steep incline. You have to walk back around to the beginning of the cave and start over.",
					false);
			while (buttonPressed == 0) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			caveStory();
		} else if (buttonPressed == 3) {
			adventureDialog.showDescriptiveDialog("You follow this path, which leads you to the bunny’s main room.",
					false);
			while (buttonPressed == 0) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			afterBunnyStory();
		}
	}

	public static void afterBunnyStory() {
		adventureDialog.setText(title, "You arrive at the bunny’s cave, and you see him laying down on his bed. What should you do?", "Wake him up and ask politely for some of his hair.", "Approach the bunny, rip off some hair, and run for your life.", "");
		while (buttonPressed == 0) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (buttonPressed == 1)
		{
			adventureDialog.showDescriptiveDialog("The bunny groggily motions towards a pile of his shedded skin on the floor. You take it and thank him.", false);
			while (buttonPressed == 0) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			adventureDialog.setText(title,
					"After safely securing the bunny hair, you travel to Spain to find the last ingredient: special syrup. As you’re walking around, you see a shady looking guy following you. What should you do?",
					"Approach the guy and ask him what he wants.", "Keep walking and try to lose him.", "");
			while (buttonPressed == 0) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (buttonPressed == 1) {
				adventureDialog.showDescriptiveDialog(
						"The guy reveals himself as a person who wants to help you find the syrup.  He had heard of a guy looking to revive Harambe and he wanted to help.",
						false);
				while (buttonPressed == 0) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				adventureDialog.setText(title,
						"The guy leads you to the place that has been nationally acclaimed to have the best syrup. After buying the syrup, you recheck all of the ingredients on the list. You find that on the back of the list there is an address to a scientist who is able to combine all of the ingredients to make the syrup. However, outside you see a band of international policemen accompanied by the guard from Easter Island. What should you do?",
						"Surrender yourself to the police. Now that you have all of the ingredients, you can just have them sent to the boss to get the serum created.",
						"Talk with the nice guard. He was nice enough on Easter Island, maybe they’re here to help.",
						"Escape through the back using your high tech knowledge of life.");
				while (buttonPressed == 0) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (buttonPressed == 1) {
					adventureDialog.showDescriptiveDialog(
							"As you walk outside, the police start shooting at you. They are not happy about you always escaping their grasp, and they’ve had enough. They take you into custody where you are locked away for a long time.",
							true);
				} else if (buttonPressed == 2) {
					adventureDialog.showDescriptiveDialog(
							"They’re not here to help. They take you into custody and you are locked away for a long time.",
							true);
				} else if (buttonPressed == 3) {
					adventureDialog.showDescriptiveDialog(
							"You hop over the cash register desk like a boss and run through the back door. With some very high skilled parkour moves, you successfully take the longest way possible to get through the back alleyway. Somehow, even though you took forever, you escape.",
							false);
					while (buttonPressed == 0) {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					adventureDialog.showDescriptiveDialog(
							"You travel to the scientist’s lab, where you inform him that you have all of the ingredients to the serum. The scientist has something to say, however.",
							false);
					while (buttonPressed == 0) {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					adventureDialog.showDescriptiveDialog(
							"He says: “You entire journey has been a big metaphor. I have been looking for such a dedicated hard-worker, and you seem to fit that description perfectly. What does this mean, you ask? Look at the entire list over again, but only looking at the first letters of the areas in which you found each of the ingredients. H for Honduras. E for Egypt. L for Louisiana. I for India. V for Vatican City. E for Easter Island. And S for Spain. What does that spell? “HE LIVES” Harambe lives on, no matter what the circumstances.” At this exact moment, the scientist pulled a lever and the entire middle wall dropped to reveal Harambe, in the flesh.",
							false);
					while (buttonPressed == 0) {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					adventureDialog.setText(title,
							"Than, an angry mob shows up demanding to see you. You hear sirens outside and helicopters surrounding the area. What should you do?",
							"Try to escape through the back door. It’s worked all these other times, why not one last time?",
							"Wait and accept your fate. There’s definitely no escaping this time.", "");
					while (buttonPressed == 0) {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (buttonPressed == 1) {
						adventureDialog.showDescriptiveDialog(
								"As you try to escape, the helicopters spray you with machine gun fire. You get hit and die.",
								true);
					} else if (buttonPressed == 2) {
						adventureDialog.showDescriptiveDialog(
								"As the angry mob sees Harambe, their emotions break down. Then the helicopters in the sky tear open the ceiling. As they see Harambe, they also break down. In the end, you are hailed as a hero.",
								false);
						while (buttonPressed == 0) {
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						adventureDialog.showFinalPart();
					}
				}
			} else if (buttonPressed == 2) {
				adventureDialog.showDescriptiveDialog(
						"As you keep walking, you accidently walk into a running of the bulls. They trample you until you are unable to walk.",
						true);
			}
		}	
		else if (buttonPressed == 2)
		{
			adventureDialog.showDescriptiveDialog("The bunny uses his magical powers to grow 100 times his original size as you try to escape. He then tramples you until you are unable to walk.", true);
		}
	}
}
DivineRPG
=========

The official repository for the DivineRPG Minecraft mod

###What you can and cannot do with DivineRPG
######You CAN:
* Download DivineRPG and use it
* Make a public Minecraft server with DivineRPG installed
* Include DivineRPG in a modpack _if you have permission from the development team, if you link back to the mod's forum thread, if you credit the team, and if you agree to remove the mod from the pack at any time if you are told to by the DivineRPG team_
* Make youtube videos showing DivineRPG gameplay _as long as you link back to the mod's forum thread_
* Use the source code as a reference for educational purposes
* Modify and recompile DivineRPG for PERSONAL use
* Fork DivineRPG on Github and write a pull request

######You CANNOT:
* Redistribute DivineRPG without permission from the team
* Claim that you made DivineRPG
* Redistribute modified versions of DivineRPG
* Copy ANY of DivineRPG's code and/or assets for use in a different project
* Put DivineRPG in a modpack without permission

###Credits
This mod is owned by XolovA, but he is no longer part of the team
***
#####Main Team
* RadioactiveStud (aka SoccerStud) - Developer
* Eternaldoom - Developer
* krwminer - Developer

#####Special Thanks to
* BossLetsPlays - Exclusive Preview Videos / Former Developer
* THEVOLCO - German Translations
* ShadowOfStrelok, fewizz, and Adaptivity - Russian Translations
* TikenTVC - Portuguese Translations
* Sheenrox82 - Our Personal Jester / Former Developer
* Declan (UKDeccy) - Models/Textures
* BlueEyes9 - Models/Textures
* Insanity414all - Wiki admin
* Laorwick - Recipes

#####Other Credits
* The_SlayerMC - Former Developer
* Mazetar - Former Developer
* TLHPoE - Former Developer
* Sactage - Server Owner and maintainer
* Aginsun - Ex Developer 
* Hologuardian - Ex Developer
* Vazkii - Ex Developer
* Majorsir - for the name of the mod. 
* Terraria - for some resources.
* Vattic - for some block textures, featured in a version of the faithful32 pack
* Vanilla MC - for some textures.
* Reika - for ore textures.
* XL biomes - for tree style.
* Blued00r - Ex Developer

***
###Contributing
***
####Submitting a Pull Request
Want to help improve our code? Fix bugs? Add to the mod? Make artistic improvements for us?

1. If you haven't already, create a Github account.
2. Click the `Fork` icon located at the top-right of this page (below your username).
3. Make the changes that you want to and commit them.
	* If you're making changes locally, you'll have to do `git commit -a` and `git push` in your command line.
4. Click `Pull Request` at the right-hand side of the gray bar directly below your fork's name.
5. Click `Click to create a pull request for this comparison`, enter your Pull Request's title, and write a detailed description telling us what you changed.
6. Click `Send pull request`, and be patient, we will review your changes

####Creating an Issue
Found a bug in our mod?  Please let us know so we can fix it ASAP!

1. Make sure your issue hasn't already been answered or fixed.  Also think about whether your issue is a valid one before submitting it.
2. Go to [the issues page](http://github.com/BossLetsPlays/DivineRPG/issues).
3. Click `New Issue` right below `Star` and `Fork`.
4. Enter your Issue's title (something that summarizes your issue), and then create a detailed description ("Could you add/change _____?" or "Found an exploit/bug:  stuff").
	* If you are reporting a bug report from an outdated or unofficial version (you got the mod from someone else, a website other than our forums or wiki, or if its been modified in ANY way) , make sure you include the following:
		* Version and commit SHA (found in changelog inside of the mod's jar)
		* ForgeModLoader log
		* Server log (if applicable)
		* Crash report (if applicable)
		* Detailed description of the bug
	* Please note, if you are not using an official version, the bug may go un-fixed
5. Click `Submit new issue`, and be patient so we can fix it!
 
####Building the Mod
Want to test the mod but you don't know how to compile the mod? Here's how. Warning: This mod is incomplete and most likely has bugs. Not recomended for casual use.

1. Download [forge](http://files.minecraftforge.net).
2. Set up a forge workspace with the terminal command `gradlew setupDecompWorkspace`.
3. Download DivineRPG's source [here](https://github.com/DivineRPG/DivineRPG/archive/master.zip).
4. Inside the forge folder, copy the files from the source inside `src/main`. (Create the `main` folder)
5. Run the terminal command from inside the forge folder: `gradlew clean build`.
6. The mod will be in `build/libs` and will most likely be named `modid-1.0.jar`.

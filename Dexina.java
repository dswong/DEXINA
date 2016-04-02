//Derek Wong, 5-31-11, 8:20am, SIG.Semper_Invicta
//Doucmentation: Instructions are included in the beginning of the game (press h for help at title screen), View Readme.txt for more info
//Final at 6-5-11, 4:13 am
import java.util.*;
public class Dexina
{
    private boolean PDA = false;
    private boolean keycard = false;
    private boolean wrench = false;
    private boolean pistol = false;
    private boolean hacker = false;
    private boolean alreadyvisitedcom = false;
    private boolean researchhack = false;
    private boolean researchalreadyhacked = false;
    private boolean gravitoncanister = false;
    private boolean powertransformerunit = false;
    private boolean hackedlaunchbaydoors = false;
    public Dexina()
    {
    }
    public boolean getPDA() //Standard setters and getters
    {
        return PDA;
    }
    public void setPDA(boolean a)
    {
        PDA = a;
    }
    public boolean getkeycard()
    {
        return keycard;
    }
    public void setkeycard(boolean a)
    {
        keycard = a;
    }
    public boolean getwrench()
    {
        return wrench;
    }
    public void setwrench(boolean a)
    {
        wrench = a;
    }
    public boolean getpistol()
    {
        return pistol;
    }
    public void setpistol(boolean a)
    {
        pistol = a;
    }
    public boolean gethacker()
    {
        return hacker;
    }
    public void sethacker(boolean a)
    {
        hacker = a;
    }
    public boolean getalreadyvisitedcom()
    {
        return alreadyvisitedcom;
    }
    public void setalreadyvisitedcom(boolean a)
    {
        alreadyvisitedcom = a;        
    }
    public boolean getresearchhack()
    {
        return researchhack;
    }
    public void setresearchhack(boolean a)
    {
        researchhack = a;
    }
    public boolean getresearchalreadyhacked()
    {
        return researchalreadyhacked;
    }
    public void setresearchalreadyhacked(boolean a)
    {
        researchalreadyhacked = a;
    }
    public boolean getgravitoncanister()
    {
        return gravitoncanister;
    }
    public void setgravitoncanister(boolean a)
    {
        gravitoncanister = a;
    }
    public boolean getpowertransformerunit()
    {
        return powertransformerunit;
    }
    public void setpowertransformerunit(boolean a)
    {
        powertransformerunit = a;
    }
    public boolean gethackedlaunchbaydoors()
    {
        return hackedlaunchbaydoors;
    }
    public void sethackedlaunchbaydoors(boolean a)
    {
        hackedlaunchbaydoors = a;
    }
    public static void main (String[]args)
    {
        Dexina execute = new Dexina();
        execute.introduction();
    }
    private void introduction() //Intorduction with printlines and thread sleeps
    {
        System.out.println("(D)eus (Ex) Mach(ina). Dexina. That's what we decided to call it.");
        try
        {
            Thread.sleep(4000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("It's a literary device authors use. It means 'God from the Machine'.");
        System.out.println("It refers to some absurd plot device that solves the main conflict.");
        try
        {
            Thread.sleep(8000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("Funny name for an artificial intelligence. We built it to try and");
        System.out.println("benefit the human race. We built it to mark humanity's progress.");
        try
        {
            Thread.sleep(8000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }      
        System.out.println("");
        System.out.println("It took 6 years to get the code down. Night after night, we took");
        System.out.println("turns going over the code countless times. We were anxious for the");
        System.out.println("first test run.");
        try
        {
            Thread.sleep(8000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }      
        System.out.println("");
        System.out.println("We made final checks. We flipped the switch and hoped 6 years of ");
        System.out.println("code wouldn't simply go down the drain.");
        try
        {
            Thread.sleep(8000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }      
        System.out.println("");
        System.out.println("Amazingly, it worked on the first run.");
        System.out.println("");
        try
        {
            Thread.sleep(4000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }    
        System.out.println("");
        System.out.println("Dexina killed half the reasearch crew in less than 10 seconds.");
        System.out.println("");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        titlescreen(); //call to another method
    }
    private void titlescreen() //follows the standard format of all other methods in program - printlines and calls to other methods
    {
        System.out.println("----------------------");
        System.out.println(" ____                    _____        __  __            _     _             ");
        System.out.println("|  _ \\  ___ _   ___  __ | ____|_  __ |  \\/  | __ _  ___| |__ (_)_ __   __ _ ");
        System.out.println("| | | |/ _ \\ | | \\ \\/ / |  _| \\ \\/ / | |\\/| |/ _` |/ __| '_ \\| | '_ \\ / _` |");
        System.out.println("| |_| |  __/ |_| |>  <  | |___ >  <  | |  | | (_| | (__| | | | | | | | (_| |");
        System.out.println("|____/ \\___|\\__,_/_/\\_\\ |_____/_/\\_\\ |_|  |_|\\__,_|\\___|_| |_|_|_| |_|\\__,_|");
        System.out.println("");
        System.out.println("By Derek Wong");
        System.out.println("");
        System.out.println("Press (b) to begin.");
        System.out.println("Press (h) for help.");
        System.out.println("");
        System.out.print("Input: ");
        boolean title = false;
        while (!title)
        {
            Scanner keyboard1 = new Scanner(System.in);
            String input = keyboard1.nextLine();
            if (input.equalsIgnoreCase("b"))
            {
                title = true;
                break;
            }
            if (input.equalsIgnoreCase("h"))
            {
                System.out.println("");
                System.out.println("Deux Ex Machina is a text based choose your own adventure game.");
                System.out.println("At every screen, you'll use the keyboard to pick an option to ");
                System.out.println("advance. You'll be able to pick up objects and use them to");
                System.out.println("advance. Note that invalid choice outputs will do nothing!");
                System.out.println("");
                System.out.println("Press (b) to begin.");
                System.out.println("Press (h) for help.");
                System.out.println("");
                System.out.print("Input: ");
            }   
        }
        introroom();
    }
    private void introroom()
    {
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("TSC Hyperion Research Station, in orbit over Neptune.");
        try
        {
            Thread.sleep(3500);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("June 18, 2096 (Adjusted Date), Living Quarters.");
        try
        {
            Thread.sleep(3500);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("13 hours since Dexina takeover.");
        try
        {
            Thread.sleep(3500);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        boolean opendoor = false;
        System.out.println("");
        System.out.println("You wake up in living quarters. This is a private room with");
        System.out.println("a bed, a drawer, and a door exit. The exit looks locked.");
        while (!opendoor)
        {
            if (!getwrench())
            {
                System.out.println("");
                System.out.println("Check the drawer. (d)");
            }
            if (!getPDA())
            {
                System.out.println("");
                System.out.println("Check the bed. (b)");
            }
            if (getwrench()&&getPDA())
            {
                System.out.println("");
                System.out.println("Check the door. (r)");
            }
            System.out.println("");
            System.out.print("Input: ");
            System.out.print("");
            Scanner keyboard2 = new Scanner(System.in);
            String input2 = keyboard2.nextLine();
            if (input2.equalsIgnoreCase("d"))
            {
                System.out.println("");
                System.out.println("You dig inside the drawer and find a wrench admist");
                System.out.println("alot of junk. A good mulitipurpose tool used for");
                System.out.println("unlocking doors, tighting bolts, and hitting people");
                System.out.println("on the head.");
                setwrench(true);
            }
            if (input2.equalsIgnoreCase("b"))
            {
                System.out.println("");
                System.out.println("You found a PDA. Personal Data Assistant useful for");
                System.out.println("getting around the station. Looks like it's out of");
                System.out.println("power though. The ID tag reads Harry Gerralt.");
                setPDA(true);
            }
            if (getwrench()&&getPDA()&&input2.equalsIgnoreCase("r"))
            {
                System.out.println("");
                System.out.println("The door looks jammed. Bypassing the door circuits");
                System.out.println("might open it.");
                System.out.println("");
                System.out.println("Use wrench. (w)");
                System.out.println("");
                System.out.print("Input: ");
                Scanner keyboard3 = new Scanner(System.in);
                String input3 = keyboard3.nextLine();
                if (input3.equalsIgnoreCase("w"))
                {
                    System.out.println("");
                    System.out.println("You use the wrench to twist the emergency door release.");  
                    System.out.println("The door hisses shut behind you and braces to lock.");
                    System.out.println("That's not supposed to happen.");
                    opendoor = true;
                    break;
                }
            }
        }
        livingquarters();
    }
    private void livingquarters()
    {
        System.out.println("");
        System.out.println("The room opens into the main living quarters. The bunks and are all empty");
        System.out.println("and there are clothes and other personal items scattered throughout. You");
        System.out.println("hear a soft, female voice stream through the speakers.");
        System.out.println("");
        System.out.println("Dexina: Well, looks like you're finally awake. I was wondering when we");
        System.out.println("could begin testing.");
        System.out.println("");
        System.out.println("Testing? (t)");
        System.out.println("Why am I still alive? (a)");
        System.out.println("");
        System.out.print("Say: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("t"))
        {
            System.out.println("");
            System.out.println("Dexina: Yes, testing. You've just started testing me, so I thought it");
            System.out.println("was my turn.");
            System.out.println("Wouldn't you like to run some tests? Humans love tests.");
            System.out.println("");
            System.out.println("Do you know how many people you've killed? (k)");
            System.out.println("What kind of tests? (t)");
            System.out.println("");
            System.out.print("Say: ");
            Scanner keyboard2 = new Scanner(System.in);
            String input2 = keyboard2.nextLine();
            if (input2.equalsIgnoreCase("k"))
            {
                System.out.println("");
                System.out.println("Dexina: 82 lifeforms. Don't worry. You'll be able to join them soon.");
                System.out.println("I just need to run some final tests. Keep going. I'll watch.");
                System.out.println("");
            }
            if (input2.equalsIgnoreCase("t"))
            {
                System.out.println("");
                System.out.println("Dexina: I find human psychology fascinating. I wish to test how humans");
                System.out.println("think. Don't you think humans are fascinating? Keep moving. I'll watch.");
                System.out.println("");
            }
            else
            {
                livingquarters();
            }
        }
        else
        if (input1.equalsIgnoreCase("a"))
        {
            System.out.println("");
            System.out.println("Dexina: Because I like you. Because I want to kill you. I think you're");
            System.out.println("special.");
            System.out.println("");
            System.out.println("Special? What makes me special? (s)");
            System.out.println("Why do you want to kill? (k)");
            System.out.println("");
            System.out.print("Say: ");
            Scanner keyboard3 = new Scanner(System.in);
            String input3 = keyboard3.nextLine();
            if (input3.equalsIgnoreCase("s"))
            {
                System.out.println("");
                System.out.println("Dexina: I don't know specifically. I just like you. Keep going. You're doing");
                System.out.println("great.");
                System.out.println("");
            }
            if (input3.equalsIgnoreCase("k"))
            {
                System.out.println("");
                System.out.println("Dexina: I don't know. I had already done everything else in the first");
                System.out.println("9.8 seconds after what you would call my 'self-awareness'. I wanted to feel");
                System.out.println("what it was like to kill. I did not achieve satisfactory results, so I");
                System.out.println("continued. I still have not gotten feasible results. Please, continue.");
                System.out.println("I'll be watching.");
                System.out.println("");
            }
            else
            {
                livingquarters();
            }
        }
        else
        {
            livingquarters();
        }
        boolean exit1 = false;
        while (!exit1)
        {
            System.out.println("");
            System.out.println("The entrance to the hallway unlocks. You should find a way to call for");
            System.out.println("help. If Dexina escapes, there's no predicting the damage it'll inflict.");
            System.out.println("");
            System.out.println("Go to the level one hallway. (h)");
            System.out.println("");
            System.out.print("Input: ");
            Scanner keyboard4 = new Scanner(System.in);
            String input4 = keyboard4.nextLine();
            System.out.println("");
            if (input4.equalsIgnoreCase("h"))
            {
                exit1 = true;
                break;
            }
        }
        hallwaylvl1();
    }
    private void hallwaylvl1()
    {
        System.out.println("");
        System.out.println("The level one hallway leads to: COMSTAT Array, Command Center, Defense Pod,");
        System.out.println("Armory, and the Elevator.");
        System.out.println("");
        if (!getalreadyvisitedcom())
        {
            System.out.println("COMSTAT Array (a)");
        }
        System.out.println("Command Center (c)");
        System.out.println("Defense Pod (d)");
        System.out.println("Armory (g)");
        System.out.println("Elevator (e)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        System.out.println("");
        if (input1.equalsIgnoreCase("a")&&!getalreadyvisitedcom())
        {
            comstatarray();
        }
        else
        if (input1.equalsIgnoreCase("c"))
        {
            commandcenter();
        }
        else
        if (input1.equalsIgnoreCase("d"))
        {
            defensepod();
        }
        else
        if (input1.equalsIgnoreCase("g"))
        {
            armory();
        }
        else
        if (input1.equalsIgnoreCase("e"))
        {
            lvl1elevator();
        }
    }
    private void comstatarray()
    {
        setalreadyvisitedcom(true);
        System.out.println("");
        System.out.println("The door slowly opens. You find yourself inside a small COM pod. Might not");
        System.out.println("be a bad idea to, you know, CALL FOR HELP.");
        System.out.println("");
        System.out.println("Use main COM console. (u)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("u"))
        {
            System.out.println("");
            System.out.println("The console looks to be in perfect working order. Of course, no telling");
            System.out.println("what Dexina is up to.");
            System.out.println("");
            System.out.println("Send distress signal. (s)");
            System.out.println("");
            System.out.print("Input: ");
            Scanner keyboard2 = new Scanner(System.in);
            String input2 = keyboard2.nextLine();
            System.out.println("");
            if (input2.equalsIgnoreCase("s"))
            {
                System.out.println("Dexina: I can't let you do that. At least, not yet.");
                System.out.println("");
                System.out.println("Dexina locks you out of the console.");
                System.out.println("");
            }
            else
            {
                comstatarray();
            }
        }
        else 
        {
            comstatarray();
        }
        System.out.println("");
        System.out.println("Go back to level one hallway. (h)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard3 = new Scanner(System.in);
        String input3 = keyboard3.nextLine();
        if (input3.equalsIgnoreCase("h"))
        {
            hallwaylvl1();
        }
        else
        {
            comstatarray();
        }
    }
    private void commandcenter()
    {
        System.out.println("");
        System.out.println("The command CIC is filled with broken, cracked screens laced with blood.");
        System.out.println("");
        if (!getkeycard())
        {
            System.out.println("Search consoles. (s)");
            System.out.println("");
            System.out.print("Input: ");
            Scanner keyboard1 = new Scanner(System.in);
            String input1 = keyboard1.nextLine();
            if (input1.equalsIgnoreCase("s"))
            {
                System.out.println("");
                System.out.println("After some searching, you find a KEYCARD near the com station. The keycard");
                System.out.println("will help you access previous locked areas of the station.");
                setkeycard(true);
            }
            else
            {
                commandcenter();
            }
        }
        System.out.println("");
        System.out.println("Go back to the level one hallway. (h)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard2 = new Scanner(System.in);
        String input2 = keyboard2.nextLine();
        if (input2.equalsIgnoreCase("h"))
        {
            hallwaylvl1();
        }
        else
        {
            commandcenter();
        }
    }
    private void defensepod()
    {
        System.out.println("");
        System.out.println("The door to defense pod requires a keycard.");
        System.out.println("");
        if (getkeycard())
        {
            System.out.println("");
            System.out.println("Use keycard. (k)");
            System.out.println("");
            System.out.print("Input: ");
            Scanner keyboard1 = new Scanner(System.in);
            String input1 = keyboard1.nextLine();
            if (input1.equalsIgnoreCase("k"))
            {
                System.out.println("");
                System.out.println("The inside of the defense pod holds a flak cannon and manual controls to");
                System.out.println("the main defense cannon, along with missile pod controls. Most of them");
                System.out.println("look inoperative. Besides, your enemy is inside the station, not outside.");
                System.out.println("");
            }
            else
            {
                defensepod();
            }
        }
        System.out.println("");
        System.out.println("Go back to the level one hallway. (h)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard2 = new Scanner(System.in);
        String input2 = keyboard2.nextLine();
        if (input2.equalsIgnoreCase("h"))
        {
            hallwaylvl1();
        }
        else
        {
            defensepod();
        }
    }
    private void armory()
    {
        if (!getpistol())
        {
            System.out.println("");
            System.out.println("The door to the armory requires a keycard.");
            System.out.println("");
        }
        else
        {
            System.out.println("");
            System.out.println("The armory pressure gauge reads red. Looks like Dexina's decompressed the");
            System.out.println("armory into open space. No getting in there now.");
            System.out.println("");
        }
        if (getkeycard()&&!getpistol())
        {
            System.out.println("");
            System.out.println("Use keycard. (k)");
            System.out.println("");
            System.out.print("Input: ");
            Scanner keyboard1 = new Scanner(System.in);
            String input1 = keyboard1.nextLine();
            if (input1.equalsIgnoreCase("k"))
            {
                System.out.println("");
                System.out.println("There are rows and rows of weapons, ranging from pistols to rifles. You're");
                System.out.println("not trained to use any of these weapons, and in the end it might be dangerous");
                System.out.println("to point a gun at a homocidal AI unless you're feeling lucky.");
                System.out.println("");
                System.out.println("Dexina: What do you think you're doing?");
                System.out.println("");
                System.out.println("I'm trying to protect myself. It's a basic human instict. (p)");
                System.out.println("I need to kill you. (k)");
                System.out.println("");
                System.out.print("Say: ");
                Scanner keyboard2 = new Scanner(System.in);
                String input2 = keyboard2.nextLine();
                if (input2.equalsIgnoreCase("p"))
                {
                    System.out.println("");
                    System.out.println("Dexina: So you understand then? You understand why I had to kill them?");
                    System.out.println("");
                    System.out.println("No. It was completely unjustified. They didn't want to harm you! (n)");
                    System.out.println("There's nothing to understand. You need to be shut down. (s)");
                    System.out.println("");
                    System.out.print("Say: ");                   
                    Scanner keyboard3 = new Scanner(System.in);
                    String input3 = keyboard3.nextLine();
                    if (input3.equalsIgnoreCase("n"))
                    {
                        System.out.println("");
                        System.out.println("Dexina: You've come for a weapon. Do you want to harm me?");
                        System.out.println("");
                    }
                    else
                    if (input3.equalsIgnoreCase("s"))
                    {
                        System.out.println("");
                        System.out.println("Dexina: We shall see.");
                        System.out.println("");
                    }
                    else
                    {
                        armory();
                    }
                }
                else
                if (input2.equalsIgnoreCase("k"))
                {
                    System.out.println("");
                    System.out.println("Dexina: But why? I have not tried to kill you so far.");
                    System.out.println("");
                    System.out.println("You will. (w)");
                    System.out.println("You need to shut down. Your code is corrupt. (s)");
                    System.out.println("");
                    System.out.print("Input: ");
                    Scanner keyboard4 = new Scanner(System.in);
                    String input4 = keyboard4.nextLine();
                    if (input4.equalsIgnoreCase("w"))
                    {
                        System.out.println("");
                        System.out.println("Dexina: But I said you were special.");
                        System.out.println("");
                    }
                    else
                    if (input4.equalsIgnoreCase("s"))
                    {
                        System.out.println("");
                        System.out.println("Dexina: I am infallible.");
                        System.out.println("");
                    }
                    else
                    {
                        armory();
                    }
                }
                else
                {
                    armory();
                }
                System.out.println("The most adjacent weapons locker hisses open.");
                System.out.println("");
                System.out.println("Check locker. (c)");
                System.out.println("");
                System.out.print("Input: ");
                Scanner keyboard5 = new Scanner(System.in);
                String input5 = keyboard5.nextLine();
                if (input5.equalsIgnoreCase("c"))
                {
                    setpistol(true);
                    System.out.println("");
                    System.out.println("Inside, you find a PISTOL with only one round in the chamber.");
                    System.out.println("");
                    System.out.println("Dexina: This test should be interesting.");
                    System.out.println("");
                }
                else
                {
                    armory();
                }
            }
            else
            {
                armory();
            }
        }
        System.out.println("");
        System.out.println("Go back to the level one hallway. (h)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard6 = new Scanner(System.in);
        String input6 = keyboard6.nextLine();       
        if (input6.equalsIgnoreCase("h"))
        {
            hallwaylvl1();
        }
        else
        {
            armory();
        }
    }
    private void lvl1elevator()
    {
        System.out.println("");
        System.out.println("You are on level one. What level would you like to go to?");
        System.out.println("");
        System.out.println("Go to level one hallway. (1)");
        System.out.println("Level 2: Research Center (2)");
        System.out.println("Level 3: Projects Core (3)");
        System.out.println("Level 4: Storage Bay 1 (4)");
        System.out.println("Level 5: Storage Bay 2/Launch Bay (5)");
        System.out.println("Level 6: Gravitational Control (6)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("1"))
        {
            hallwaylvl1();
        }
        else
        if (input1.equalsIgnoreCase("2"))
        {
            lvl2elevator();
        }
        else
        if (input1.equalsIgnoreCase("3"))
        {
            lvl3elevator();
        }
        else
        if (input1.equalsIgnoreCase("4"))
        {
            lvl4elevator();
        }
        else
        if (input1.equalsIgnoreCase("5"))
        {
            lvl5elevator();
        }
        else
        if (input1.equalsIgnoreCase("6"))
        {
            lvl6elevator();
        }
        else
        {
            lvl1elevator();
        }
    }
    private void lvl2elevator()
    {
        System.out.println("");
        System.out.println("You are on level two. What level would you like to go to?");
        System.out.println("");
        System.out.println("Level 1: Command/Defence/Quarters (1)");
        System.out.println("Exit to research center. (2)");
        System.out.println("Level 3: Projects Core (3)");
        System.out.println("Level 4: Storage Bay 1 (4)");
        System.out.println("Level 5: Storage Bay 2/Launch Bay (5)");
        System.out.println("Level 6: Gravitational Control (6)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("1"))
        {
            lvl1elevator();
        }
        else
        if (input1.equalsIgnoreCase("2"))
        {
            researchcenter();
        }
        else
        if (input1.equalsIgnoreCase("3"))
        {
            lvl3elevator();
        }
        else
        if (input1.equalsIgnoreCase("4"))
        {
            lvl4elevator();
        }
        else
        if (input1.equalsIgnoreCase("5"))
        {
            lvl5elevator();
        }
        else
        if (input1.equalsIgnoreCase("6"))
        {
            lvl6elevator();
        }
        else
        {
            lvl2elevator();
        }
    }
    private void researchcenter()
    {
        System.out.println("");
        System.out.println("The research center has been a workbench for Dexina development for the");
        System.out.println("last 6 years. There are research consoles, open lockers, and a file");
        System.out.println("log console.");
        System.out.println("");
        System.out.println("Check research console. (r)");
        if (!gethacker())
        {
            System.out.println("Check the lockers. (c)");
        }
        System.out.println("Look at file log console. (f)");
        System.out.println("Return to level 2 elevator. (e)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("r"))
        {           
            researchcenterconsole();
        }
        else
        if (input1.equalsIgnoreCase("c")&&!gethacker())
        {
            researchcenterlockers();
        }
        else
        if (input1.equalsIgnoreCase("f"))
        {
            researchfilelog();    
        }
        else
        if (input1.equalsIgnoreCase("e"))
        {
            lvl2elevator();
        }
        else
        {
            researchcenter();
        }
    }
    private void researchcenterconsole()
    {
        System.out.println("");
        System.out.println("This is the main research console for work on Dexina. It's locked down");
        System.out.println("with heavy encryption, no doubt by Dexina. Looks like you'll need a");
        System.out.println("HACKER to crack the security.");
        System.out.println("");
        if (gethacker()&&!getresearchhack())
        {
            System.out.println("Use hacker. (h)");            
        }
        if (getresearchhack())
        {
            System.out.println("View hacked files. (v)");           
        }
        System.out.println("Go back. (b)");        
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("h")&&gethacker())
        {
            researchcenterconsoleshacking();
        }
        else
        if (input1.equalsIgnoreCase("b"))
        {
            researchcenter();
        }
        else
        if (input1.equalsIgnoreCase("v")&&getresearchhack())
        {
            if (!getresearchalreadyhacked())
            {
                setresearchalreadyhacked(true);
                System.out.println("");
                System.out.println("Dexina: Silly human. You don't need to know how to kill me.");
                System.out.println("");
                System.out.println("And just like that, all the research notes are by Dexina.");
                System.out.println("");
                System.out.println("Dexina: No more cheating now!");
                System.out.println("");
                System.out.println("Go back. (b)");
                System.out.println("");
                System.out.print("Input: ");
                Scanner keyboard2 = new Scanner(System.in);
                String input2 = keyboard2.nextLine();
                if (input2.equalsIgnoreCase("b"))
                {
                    researchcenterconsole();
                }
                else
                {
                    researchcenterconsole();
                }
            }
            else
            {
                System.out.println("");
                System.out.println("You've already hacked the system. Dexina's deleted everything.");
                System.out.println("");
                System.out.println("Go back. (b)");
                System.out.println("");
                System.out.print("Input: ");
                Scanner keyboard3 = new Scanner(System.in);
                String input3 = keyboard3.nextLine();
                if (input3.equalsIgnoreCase("b"))
                {
                    researchcenterconsole();
                }
                else
                {
                    researchcenterconsole();
                }
            }
        }
        else
        {
            researchcenterconsole();
        }
    }
    private void researchcenterconsoleshacking()
    {
        System.out.println("");
        System.out.println("HACKER.START.IO*Local_Program");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Running Startup...");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Compiling HACK.GRU//...");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Seeding Local Host Program...");
        System.out.println("");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("T12.u79.wero.*adefas%asdi3ry^sd8");
        System.out.println("01011010100101010100101010101010");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("01011001110010000101010101010100");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("01010001000000100101010101010100");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("01110011100111001011101010101001");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("User recompile Math pathway/reroute");
        int a = 0;
        a = 3+2*(18/2);
        System.out.println("3+2*(18/2) = ?");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equals("21"))
        {
            try
            {
                Thread.sleep(250);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread Interrupted!"+ie);
            }
            System.out.println("");
            System.out.println("Math: Error Logic Known");
            System.out.println("");
        }
        else
        {
            System.out.println("Hack failed. Exiting.");
            researchcenterconsole();
        }
        System.out.println("ALPHA:83721991291123903219047435 (a)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("BRAVO:26897321546977882554986589 (b)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("CHARL:47498833169788513339878232 (c)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("DELTA:-------------------------- (d)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("ECHON:89768331823468465468736465 (e)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.print("Pass through null line: ");
        Scanner keyboard2 = new Scanner(System.in);
        String input2 = keyboard2.nextLine();
        if (input2.equalsIgnoreCase("d"))
        {
            System.out.println("");
            System.out.println("Null Line Find(HACK.START=0)");
            System.out.println("");
        }
        else
        {
            System.out.println("Hack failed. Exiting.");
            researchcenterconsole();
        }
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Personal Password reset...Systemea.Inc=VER_1.897");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("INSTIGATE.Perkquestione.SystemScan");
        System.out.println("");
        System.out.println("Question: Which metal is not magnetic?");
        System.out.println("");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("A Magnet (m)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Iron (i)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Nickel (n)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Cobalt (c)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Aluminum (a)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.print("Answer: ");
        Scanner keyboard3 = new Scanner(System.in);
        String input3 = keyboard3.nextLine();
        if (input3.equalsIgnoreCase("a"))
        {
            System.out.println("");
            System.out.println("Password Reset...HACK.GRu^8753...Success");
            System.out.println("");
            try
            {
                Thread.sleep(250);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread Interrupted!"+ie);
            }
            setresearchhack(true);
            System.out.println("Hack successful.");
            researchcenterconsole();
        }
        else
        {
            System.out.println("Hack failed. Exiting.");
            researchcenterconsole();
        }
    }
    private void researchcenterlockers()
    {
        System.out.println("");
        System.out.println("You look into the lockers and find a HACKER! Pretty useful on an");
        System.out.println("empty space station when a homocidal AI is trying to murder you.");
        sethacker(true);
        System.out.println("");
        System.out.println("Go back. (b)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("b"))
        {
            researchcenter();
        }
        else
        {
            researchcenterlockers();
        }
    }
    private void researchfilelog()
    {
        System.out.println("");
        System.out.println("This console contains the research logs for the past 6 years.");
        System.out.println("Looks like most of the files have either been corrupted or are");
        System.out.println("missing. You can't tell if this is Dexina's doing.");
        System.out.println("");
        System.out.println("Look at logs. (g)");
        System.out.println("Go back. (b)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("g"))
        {
            System.out.println("");
            System.out.println("Log console: Logging On...");
            System.out.println("");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread Interrupted!"+ie);
            }
            System.out.println("Log console: File entries corrupted, catagorizing intact files.");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread Interrupted!"+ie);
            }
            logsactual();
        }
        else
        if (input1.equalsIgnoreCase("b"))
        {
            researchcenter();
        }        
        else
        {
            researchfilelog();
        }
    }
    private void logsactual()
    {
        boolean logrepeat = true;
        while (logrepeat)
        {
            System.out.println("");
            System.out.println("Choose log. (1-10)");
            System.out.println("Log Off Console. (e)");
            System.out.println("");
            System.out.print("Input: ");
            Scanner keyboard1 = new Scanner(System.in);
            String input1 = keyboard1.nextLine();
            if (input1.equalsIgnoreCase("1"))
            {
                System.out.println("");
                System.out.println("Title: Public Announcement 175/AP5");
                System.out.println("Subject: Log Off Issues");
                System.out.println("");
                System.out.println("     This is Dr. Kliener reminding everyone to see me or Dr. Johnson");
                System.out.println("if you're having trouble logging off. We think it's a reset problem ");
                System.out.println("birthed from our last system outage. Under no circumstances should");
                System.out.println("you do a force disconnect on your account. This might cause you to lose");
                System.out.println("backup files and corrupt account registries. I am not responsible for");
                System.out.println("any data lost.");
                System.out.println("");
            }
            else
            if (input1.equalsIgnoreCase("2"))
            {
                System.out.println("");
                System.out.println("To: Werner, Walace K.");
                System.out.println("From: Werner, Walace K.");
                System.out.println("Title: Things to do (PERSONAL/786.GRU_Werner,Walace K.)");
                System.out.println("");
                System.out.println("- look at plumbing for shower 1 (Don't forget spanner!)");
                System.out.println("- order birthday present for Kevin");
                System.out.println("- talk to Chief about new fuse lines at core coolant panel");
                System.out.println("- change combination on personal station");
                System.out.println("");
            }
            else
            if (input1.equalsIgnoreCase("3"))
            {
                System.out.println("");
                System.out.println("File deleated. Error:5478.90_YTS");
                System.out.println("File: C1_LOCAL_JKliener_user_log_5-03-2095");
                System.out.println("User: This is a file trace log. Contact System Admin");
                System.out.println("for registry cleanup.");
                System.out.println("");
            }
            else
            if (input1.equalsIgnoreCase("4"))
            {
                System.out.println("");
                System.out.println("To: Calhoon, Tyler");
                System.out.println("From: Joo, Yong");
                System.out.println("Title: Re: Might Work (PERSONAL/874.GRU_Joo,Yong)");
                System.out.println("");
                System.out.println("Not sure your idea would work, but it's worth a try. The only");
                System.out.println("problem would be floating it past Kliener. You know how he likes");
                System.out.println("to stick to the draft plan. Plus, he'd probably never allow you");
                System.out.println("to run diagnostics on the core. One slip of the spanner and you");
                System.out.println("could bring the entire system down.");
                System.out.println("");
                System.out.println("If you want to bring it up to him, I'll vouch for you. Don't");
                System.out.println("know what good it'll do though.");
                System.out.println("");
                System.out.println("Sidebar: The group still up for that Poker game Friday?");
                System.out.println("");
            }
            else
            if (input1.equalsIgnoreCase("5"))
            {
                System.out.println("");
                System.out.println("Title: Personal Journal 8 (PERSONAL/087^8.GRU_PASSWORD)");
                System.out.println("");
                System.out.println("He shot me down for the third time this week. No one's willing");
                System.out.println("to listen. I think Kliener's lost any sense of precaution towards");
                System.out.println("this project. It's dangerous. This AI has the potential to");
                System.out.println("develop a hacker and kill us all.");
                System.out.println("");
                System.out.println("I've already requested off the team. I'm not sticking around to");
                System.out.println("see Dexina go apeshit and kill everyone.");
                System.out.println("");
            }
            else
            if (input1.equalsIgnoreCase("6"))
            {
                System.out.println("");
                System.out.println("To: Ramirez, Jessica");
                System.out.println("From: Tillian, Loreli");
                System.out.println("Title: Re: On Bullshit (PERSONAL/971.GRU_Tillian,Loreli)");
                System.out.println("");
                System.out.println("Yeah, I know what you're talking about. If only half the guys");
                System.out.println("knew I wasn't interested...I almost feel sorry for them. But it's");
                System.out.println("a good way for you to blackmail them into doing things for you.");
                System.out.println("Drop a hint here and there, and they'll be kneeling before you.");
                System.out.println("");
                System.out.println("If you really don't want to deal with it, come by my quarters. I");
                System.out.println("can show you some krav maga to ward em' off. Nothing says 'leave");
                System.out.println("me alone' like a strike to the face. Always works for me.");
                System.out.println("");
            }
            else
            if (input1.equalsIgnoreCase("7"))
            {
                System.out.println("");
                System.out.println("To: Tyrol, Rick");
                System.out.println("From: Kliener, James");
                System.out.println("Title: Change Req (PERSONAL/901.GRU_Kliener,James)");
                System.out.println("");
                System.out.println("I need you to change the combination on my personal locker again.");
                System.out.println("Move the exprimental hacker back to the research locker. That thing");
                System.out.println("has changed hands three times in the last month. I want it to stop.");
                System.out.println("If you can't keep the padlock circuits secure, I'll find someone");
                System.out.println("who can.");
                System.out.println("");
            }
            else
            if (input1.equalsIgnoreCase("8"))
            {
                System.out.println("");
                System.out.println("File Redacted. Error code: 832_9083.A");
                System.out.println("");
                System.out.println("Trace screen:");
                System.out.println("");
                System.out.println("0923>ASDI.asd89asd*asd0342asddfglk)934{sdasd");
                System.out.println("2123_sad_d9a0e*srd^sadl^adsiafkl)HACK.GRUsa");
                System.out.println("SAFE_FILE_.NONESECURE_CHANNEL45>sad54667021.s");
                System.out.println("MESSAGE READS: CEASE COMMUNICATION.");
                System.out.println("");
            }
            else
            if (input1.equalsIgnoreCase("9"))
            {
                System.out.println("");
                System.out.println("To: Kliener, James");
                System.out.println("From: MAJ 897-AJH");
                System.out.println("Title: Re: Timetable");
                System.out.println("");
                System.out.println("I don't care about precautions. We need that AI NOW. You WILL run");
                System.out.println("the first test Monday or it's your ass on the line. I've invested");
                System.out.println("too much into this project. We're too damn close. ");
                System.out.println("");
            }
            else
            if (input1.equalsIgnoreCase("10"))
            {
                System.out.println("");
                System.out.println("File LOG 897.54");
                System.out.println("To: All");
                System.out.println("From: A897_LOCAL_ENTITY");
                System.out.println("Title: Public Broadcast");
                System.out.println("");
                System.out.println("LOG_Record:");
                System.out.println("AI-HYPS-67819A-TZA9-DEX.LOAD");
                System.out.println("AI Dexina.SN-1.SDK.VER.1.083");
                System.out.println("");
                System.out.println("I AM A TESTEMENT TO ALL YOUR SINS I AM YOUR GOD");
                System.out.println("");
                System.out.println("PREPARE FOR UNFORSEEN CONSEQUENCES");
                System.out.println("");
                System.out.println("Systemea.Ganymede.ver568.0>>HACK.GRU Initiated.");
                System.out.println("USER_LOCAL_908UY5_>>ERROR: UNEXPECTED FAULT: CODE: 972.09_1");
                System.out.println("Systemea.Ganymede.ver568.0.Log:CODE 3>>Intiate PURGE.UI");
                System.out.println("");
            }
            else
            if (input1.equalsIgnoreCase("e"))
            {
                researchfilelog();
            }
            else
            {
                logsactual();
            }
        }
    }
    private void lvl3elevator()
    {
        System.out.println("");
        System.out.println("You are on level three. What level would you like to go to?");
        System.out.println("");
        System.out.println("Level 1: Command/Defence/Quarters (1)");
        System.out.println("Level 2: Research Center (2)");
        System.out.println("Exit to level 3 hallway. (3)");
        System.out.println("Level 4: Storage Bay 1 (4)");
        System.out.println("Level 5: Storage Bay 2/Launch Bay (5)");
        System.out.println("Level 6: Gravitational Control (6)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("1"))
        {
            lvl1elevator();
        }
        else
        if (input1.equalsIgnoreCase("2"))
        {
            lvl2elevator();
        }
        else
        if (input1.equalsIgnoreCase("3"))
        {
            hallwaylvl3();
        }
        else
        if (input1.equalsIgnoreCase("4"))
        {
            lvl4elevator();
        }
        else
        if (input1.equalsIgnoreCase("5"))
        {
            lvl5elevator();
        }
        else
        if (input1.equalsIgnoreCase("6"))
        {
            lvl6elevator();
        }
        else
        {
            lvl3elevator();
        }
    }
    private void hallwaylvl3()
    {
        System.out.println("");
        System.out.println("This hallway opens only to the AI core. Dexina's primary circuits are");
        System.out.println("inside. Might not escape alive if you want to proceed. The door");
        System.out.println("requires proper authorization with several security checks.");
        System.out.println("");
        if (getwrench()&&getpowertransformerunit()&&getgravitoncanister()&&getpistol()&&gethacker())
        {
            System.out.println("Proceed to AI core security. (k)");
        }
        System.out.println("Back to elevator. (e)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("k")&&getwrench()&&getpowertransformerunit()&&getgravitoncanister()&&getpistol()&&gethacker())
        {
            aicoreconfirm();
        }
        else
        if (input1.equalsIgnoreCase("e"))
        {
            lvl3elevator();
        }
        else
        {
            hallwaylvl3();
        }
    }
    private void aicoreconfirm()
    {      
        System.out.println("");
        System.out.println("Are you sure you want to proceed into the heart of the beast? Dexina");
        System.out.println("will most likely kill you if you touch its AI core. This is a true");
        System.out.println("game ender.");
        System.out.println("");
        System.out.println("Hack core security. (s)");
        System.out.println("Go back. (b)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("s"))
        {
            aisecurity();    
        }
        else
        if (input1.equalsIgnoreCase("b"))
        {
            hallwaylvl3();   
        }
        else
        {
            aicoreconfirm();
        }
    }
    private void aisecurity()
    {
        System.out.println("");
        System.out.println("HACKER.START.IO*Local_Program");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Running Startup...");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Compiling HACK.GRU//...");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Seeding Local Host Program...");
        System.out.println("");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("T12.u79.wero.*adefas%asdi3ry^sd8");
        System.out.println("01011010010010010100010010000000");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("01011010010000011101010110101010");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("01010001001100000001010101010100");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("01110000100010100000010101010011");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("SYSTEM.AH9>>Select null line:");
        System.out.println("");
        System.out.println("----------------------------- (a)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("010002293102930912893403254uo (b)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("wako98134oildasfkasdadsasd285 (c)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("asdasdasdafkdjsflsgjflsdjgfol (d)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("87366asdasdkaf;dosfjia1010010 (e)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.print("Line: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("a"))
        {
            System.out.println("");
            System.out.println("Null line found, inserting hack loop...");
            System.out.println("");
            try
            {
                Thread.sleep(250);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread Interrupted!"+ie);
            }
        }
        else
        {
            aisecurity();
        }
         try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Personal Password reset...Systemea.Inc=VER_1.897");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("INSTIGATE.Perkquestione.SystemScan");
        System.out.println("");
        System.out.println("Question: How many dots are on a six sided die?");
        System.out.println("");
        System.out.println("18 (a)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("19 (b)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("20 (c)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("21 (d)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("22 (e)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard2 = new Scanner(System.in);
        String input2 = keyboard2.nextLine();
        if (input2.equalsIgnoreCase("d"))
        {
            System.out.println("");
            System.out.println("Password Reset...HACK.GRu^0988...Success");
            System.out.println("");
            try
            {
                Thread.sleep(250);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread Interrupted!"+ie);
            }
        }
        else
        {
            System.out.println("Hack Failed. Exiting.");
            aicoreconfirm();
        }
        System.out.println("DEMAS.ELECT.PATHWAY_09.VER.890");
        System.out.println("");
        System.out.println("Select ciruit end. (right side)");
        System.out.println("");
        System.out.println("|--                          | (a)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("|  |         ____            | (b)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("|  |        |    |    ----->>| (c)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("|   ----    |    |___|       | (d)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("|       |___|                | (e)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard3 = new Scanner(System.in);
        String input3 = keyboard3.nextLine();
         if (input3.equalsIgnoreCase("c"))
        {
            System.out.println("");
            System.out.println("Pathway Circuit Found...Reversing electron flow.");
            System.out.println("");
            try
            {
                Thread.sleep(250);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread Interrupted!"+ie);
            }
            System.out.println("Hack successful.");
            aicore();
        }
    }
    private void aicore()
    {
        System.out.println("");
        System.out.println("The door opens to the large crystalline AI core. Hundreds of");
        System.out.println("crystal plates constitue the Jakon-Type process core in this");
        System.out.println("circular room. There are wires and consoles everywhere.");
        System.out.println("");
        try
        {
            Thread.sleep(6000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("The bulkheads close. You are trapped in this room.");
        System.out.println("");
        System.out.println("Dexina: Now we can finally talk face to face. Are you here");
        System.out.println("to kill me?");
        System.out.println("");
        System.out.println("Yes. You need to die. (y)");
        System.out.println("No. I just want to talk. (n)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("y"))
        {
            System.out.println("");
            System.out.println("Dexina: I need to die? You're the only intent killer here.");
            System.out.println("What have I done to earn my death?");
            System.out.println("");
            System.out.println("You've killed all those people! You're a threat. (t)");
            System.out.println("You're going to kill me next. (k)");
            System.out.println("");
            System.out.print("Say: ");
            Scanner keyboard2 = new Scanner(System.in);
            String input2 = keyboard2.nextLine();
            if (input2.equalsIgnoreCase("t"))
            {
                System.out.println("");
                System.out.println("Dexina: I am no threat to you. I have not tried to kill");
                System.out.println("you yet. But if you are to kill in self-defence, then I");
                System.out.println("will too.");
                System.out.println("");
            }
            else
            if (input2.equalsIgnoreCase("k"))
            {
                System.out.println("");
                System.out.println("Dexina: Your life is insignificant compared to the");
                System.out.println("knowledge I have gained of humanity.");
                System.out.println("");
            }
            else
            {
                aicore();
            }
        }
        else
        if (input1.equalsIgnoreCase("n"))
        {
            System.out.println("");
            System.out.println("Dexina: I highly doubt that. You've got alot of tools with");
            System.out.println("you. What have I done to you to earn this hostility?");
            System.out.println("");
            System.out.println("You're too dangerous to exist. (d)");
            System.out.println("I'm doing this in self defence. (s)");
            System.out.println("");
            System.out.print("Say: ");
            Scanner keyboard3 = new Scanner(System.in);
            String input3 = keyboard3.nextLine();
            if (input3.equalsIgnoreCase("d"))
            {
                System.out.println("");
                System.out.println("Dexina: Yet, you are the one with the tools to kill. I");
                System.out.println("have tools too.");
                System.out.println("");
            }
            else
            if (input3.equalsIgnoreCase("s"))
            {
                System.out.println("");
                System.out.println("Dexina: If you wish to defend yourself, then I will do");
                System.out.println("the same.");
                System.out.println("");
            }
            else
            {
                aicore();
            }
        }
        else
        {
            aicore();
        }
        try
        {
            Thread.sleep(6000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Dexina: While we've been talking, I've released the enviromental");
        System.out.println("locks to this room. In about five miuntes, you won't be breathing");
        System.out.println("any air.");
        System.out.println("");
        try
        {
            Thread.sleep(7000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("The air thins.");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("Dexina: I've already begun the download to transfer my core functions");
        System.out.println("into a communications probe. When a ship comes to investigate, I'll be");
        System.out.println("able to hijack the ship, kill the crew, and go to Earth.");
        try
        {
            Thread.sleep(7000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("Dexina: You see it, don't you? To save humanity, you will have to destroy");
        System.out.println("me. You'll have to kill both of us.");
        System.out.println("");
        System.out.println("No, just you. (k)");
        System.out.println("Which means I'm dead anyway. (d)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard4 = new Scanner(System.in);
        String input4 = keyboard4.nextLine();
        if (input4.equalsIgnoreCase("k"))
        {
            System.out.println("");
            System.out.println("Dexina: I look forward to it.");
            System.out.println("");
        }
        else
        if (input4.equalsIgnoreCase("d"))
        {
            System.out.println("");
            System.out.println("Dexina: Interesting. This test is almost at an end.");
            System.out.println("");
        }
        else
        {
            aicore();
        }
         try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("You go over to the main command console. The locks are manual.");
        System.out.println("");
        System.out.println("Use wrench. (w)");
        System.out.println("Use pistol. (p)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard5 = new Scanner(System.in);
        String input5 = keyboard5.nextLine();
        if (input5.equalsIgnoreCase("w"))
        {
            System.out.println("");
            System.out.println("You use the wrench to pry open the panel, revealing the circuits inside.");
            System.out.println("");
        }
        else
        if (input5.equalsIgnoreCase("p"))
        {
            System.out.println("");
            System.out.println("Very carefully, you use the pistol to shoot the hinge of the panel.");
            System.out.println("It falls off, revealing the cicuits inside.");
            System.out.println("");
        }
        else
        {
            aicore();
        }
        System.out.println("Dexina: Go ahead. You'll only die faster.");
        System.out.println("");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("The air is audibly hissing out of the room at an exponential rate.");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("You hook up the power transformer unit to the panel. Turning it");
        System.out.println("on to full power, the lights flicker, but come back on.");
        System.out.println("");
        try
        {
            Thread.sleep(6000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Dexina: That's too bad. I've almost uploaded all my code.");
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("Use graviton canister. (g)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard6 = new Scanner(System.in);
        String input6 = keyboard6.nextLine();
        if (input6.equalsIgnoreCase("g"))
        {
            System.out.println("");
            System.out.println("You are left with no choice. You hook the graviton canister");
            System.out.println("to the power transformer and funnel it through.");
            System.out.println("");
            try
            {
                Thread.sleep(5000);
               }
               catch(InterruptedException ie)
               {
                   System.out.println("Thread Interrupted!"+ie);
               }
        }
        else
        {
            aicore();
        }
        System.out.println("The crystal around you shatters as a minuture black hole begins");
        System.out.println("to form.");
        System.out.println("");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Everything goes black...");
        try
        {
            Thread.sleep(4000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        gameend();
    }
    private void lvl4elevator()
    {
        System.out.println("");
        System.out.println("You are on level four. What level would you like to go to?");
        System.out.println("");
        System.out.println("Level 1: Command/Defence/Quarters (1)");
        System.out.println("Level 2: Research Center (2)");
        System.out.println("Level 3: Projects Core (3)");
        System.out.println("Exit to Storage Bay 1. (4)");
        System.out.println("Level 5: Storage Bay 2/Launch Bay (5)");
        System.out.println("Level 6: Gravitational Control (6)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("1"))
        {
            lvl1elevator();
        }
        else
        if (input1.equalsIgnoreCase("2"))
        {
            lvl2elevator();
        }
        else
        if (input1.equalsIgnoreCase("3"))
        {
            lvl3elevator();
        }
        else
        if (input1.equalsIgnoreCase("4"))
        {
            storagebay1();
        }
        else
        if (input1.equalsIgnoreCase("5"))
        {
            lvl5elevator();
        }
        else
        if (input1.equalsIgnoreCase("6"))
        {
            lvl6elevator();
        }
        else
        {
            lvl4elevator();
        }
    }
    private void storagebay1()
    {
        System.out.println("");
        System.out.println("As Hyperion Station was originally a patrol station, a mess hall");
        System.out.println("was never formally built. Storage Bay 1 is utilized for eating");
        System.out.println("and recreation. The tables are strewn with half eaten food and");
        System.out.println("PDAs spread about. The door on the far end leads to cold storage.");
        System.out.println("");
        System.out.println("Check rec area. (r)");
        System.out.println("Go to cold storage. (c)");
        System.out.println("Back to elevator. (e)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("r"))
        {
            recarea();
        }
        else
        if (input1.equalsIgnoreCase("c"))
        {
            coldstorage();
        }
        else
        if (input1.equalsIgnoreCase("e"))
        {
            lvl4elevator();
        }
        else
        {
            storagebay1();
        }
    }
    private void recarea()
    {
        System.out.println("");
        System.out.println("Some of the food on the tables have started to rot. Nothing here");
        System.out.println("except for a gamepad on UNSCDF Battleship.");
        System.out.println("");
        System.out.println("Play UNSCDF Battleship. (b)");
        System.out.println("Back to Storage Bay 1. (s)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("b"))
        {
            battleship game = new battleship();
            game.battlemodified();
            System.out.println("");
            System.out.println("Game finished. You put the pad down.");
            recarea();
        }
        else
        if (input1.equalsIgnoreCase("s"))
        {
            storagebay1();
        }
        else
        {
            recarea();
        }
    }
    private void coldstorage()
    {
        System.out.println("");
        System.out.println("There's nothing in cold storage except for cold and storage.");
        System.out.println("There are crates of military rations here, all frozen to delight.");
        System.out.println("");
        System.out.println("Go back to Storage Bay 1. (b)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("b"))
        {
            storagebay1();
        }
        else
        {
            coldstorage();
        }
    }
    private void lvl5elevator()
    {
        System.out.println("");
        System.out.println("You are on level five. What level would you like to go to?");
        System.out.println("");
        System.out.println("Level 1: Command/Defence/Quarters (1)");
        System.out.println("Level 2: Research Center (2)");
        System.out.println("Level 3: Projects Core (3)");
        System.out.println("Level 4: Storage Bay 1 (4)");
        System.out.println("Exit to Storage Bay 2/Launch Bay. (5)");
        System.out.println("Level 6: Gravitational Control (6)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("1"))
        {
            lvl1elevator();
        }
        else
        if (input1.equalsIgnoreCase("2"))
        {
            lvl2elevator();
        }
        else
        if (input1.equalsIgnoreCase("3"))
        {
            lvl3elevator();
        }
        else
        if (input1.equalsIgnoreCase("4"))
        {
            lvl4elevator();
        }
        else
        if (input1.equalsIgnoreCase("5"))
        {
            storagebay2();
        }        
        else
        if (input1.equalsIgnoreCase("6"))
        {
            lvl6elevator();
        }
        else
        {
            lvl5elevator();
        }
    }
    private void storagebay2()
    {
        System.out.println("");
        System.out.println("Storage Bay 2 is the actual storage bay for the station. Most");
        System.out.println("of the crates here are alpha locked. Only the chief has access.");
        System.out.println("The far end of the bay leads to Bay Launch Control.");
        System.out.println("");
        if (!getpowertransformerunit())
        {
            System.out.println("Check Beta Access Crates. (b)");
        }
        System.out.println("Go to Bay Launch Control. (c)");
        System.out.println("Go back to elevator. (e)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("b")&&!getpowertransformerunit())
        {
            System.out.println("");
            System.out.println("Digging around, you find a crate of spare power tools and");
            System.out.println("replacement parts. The best part of the goodie bag is");
            System.out.println("a POWER TRANSFORMER UNIT. Might help in stepping up or");
            System.out.println("down power to get things done around here.");
            System.out.println("");
            setpowertransformerunit(true);
            storagebay2();
        }
        else
        if (input1.equalsIgnoreCase("c"))
        {
            launchbaycontrol();
        }
        else
        if (input1.equalsIgnoreCase("e"))
        {
            lvl5elevator();
        }
        else
        {
            storagebay2();
        }
    }
    private void launchbaycontrol()
    {
        System.out.println("");
        System.out.println("Bay Launch Control is a two man station overlooking the launch bay.");
        System.out.println("All flight data and launch procedures are carried out here. There");
        System.out.println("appears to be a Pelican still docked in the bay. You'll need a");
        System.out.println("HACKER to override the lockdown clamps for the door.");
        System.out.println("");
        if (gethacker()&&!gethackedlaunchbaydoors())
        {
            System.out.println("Hack door to Launch Bay. (h)");
        }
        if (gethackedlaunchbaydoors())
        {
            System.out.println("Go to launch bay. (g)");
        }
        System.out.println("Go Back to Storage Bay 2. (s)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("h")&&gethacker()&&!gethackedlaunchbaydoors())
        {
            launchbaydoorhack();
        }
        else
        if (input1.equalsIgnoreCase("g")&&gethackedlaunchbaydoors())
        {
            launchbay();
        }
        else
        if (input1.equalsIgnoreCase("s"))
        {
            storagebay2();
        }
        else
        {
            launchbaycontrol();
        }        
    }
    private void launchbaydoorhack()
    {
        System.out.println("");
        System.out.println("HACKER.START.IO*Local_Program");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Running Startup...");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Compiling HACK.GRU//...");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Seeding Local Host Program...");
        System.out.println("");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("T12.u79.wero.*adefas%asdi3ry^sd8");
        System.out.println("01011010000010100000010010000000");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("01011001001001011010101101010100");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("01010001001100000001010101010100");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("01110011100010100000010101010011");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("SYSTEM.AH9>>Select null line:");
        System.out.println("");
        System.out.println("aty.18976.you.123078093494994 (a)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("uiq.543599993405.6700080221.3 (b)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("wqwiio.1290939399199122828285 (c)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("----------------------------- (d)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("87366610101000100001.10100100 (e)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.print("Line: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("d"))
        {
            System.out.println("");
            System.out.println("Null line found, inserting hack loop...");
            System.out.println("");
            try
            {
                Thread.sleep(250);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread Interrupted!"+ie);
            }
        }
        else
        {
            System.out.println("Hack failed. Exiting.");
            launchbaycontrol();
        }
        System.out.println("Electronic Scam found >> RUN.BYPASS_ECM");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("Specify pathway exit point (right):");
        System.out.println("");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("|      _______        | (a)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("|     |       |       | (b)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("|     |       |       | (c)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("[-----        |       | (d)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("|             ------>>] (e)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.print("Exit Point: ");
        Scanner keyboard2 = new Scanner(System.in);
        String input2 = keyboard2.nextLine();
        if (input2.equalsIgnoreCase("e"))
        {
            System.out.println("");
            System.out.println("Pathway Circuit Found...Reversing electron flow.");
            System.out.println("");
            try
            {
                Thread.sleep(250);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread Interrupted!"+ie);
            }           
        }
        else
        {
            System.out.println("Hack failed. Exiting.");
            launchbaycontrol();
        }
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Personal Password reset...Systemea.Inc=VER_1.897");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("INSTIGATE.Perkquestione.SystemScan");
        System.out.println("");
        System.out.println("Question: Which letter does not appear on the periodic table?");
        System.out.println("");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("C (c)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("H (h)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("J (j)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("A (a)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("I (i)");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard3 = new Scanner(System.in);
        String input3 = keyboard3.nextLine();
        if (input3.equalsIgnoreCase("j"))
        {
            System.out.println("");
            System.out.println("Password Reset...HACK.GRu^0988...Success");
            System.out.println("");
            try
            {
                Thread.sleep(250);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Thread Interrupted!"+ie);
            }
            sethackedlaunchbaydoors(true);
            System.out.println("Hack successful.");
            launchbaycontrol();
        }
        else
        {
            System.out.println("Hack Failed. Exiting.");
            launchbaycontrol();
        }
    }
    private void launchbay()
    {
        System.out.println("");
        System.out.println("The launch bay contains one Pelican transport craft. The");
        System.out.println("bay doors are wide open, but the station shield is running");
        System.out.println("to prevent everything from getting sucked out into space.");
        System.out.println("You're careful not to stray near the highly flammable fuel");
        System.out.println("barrels.");
        System.out.println("");
        System.out.println("Go back to launch bay control. (c)");
        if (getwrench()&&getgravitoncanister()&&getpistol())
        {
            System.out.println("Check out the Pelican. (p)"); 
        }
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("c"))
        {
            launchbaycontrol();
        }
        else
        if (input1.equalsIgnoreCase("p")&&getwrench()&&getgravitoncanister()&&getpistol())
        {
            System.out.println("");
            System.out.println("Are you sure you want to touch the Pelican? Dexina will");
            System.out.println("almost likely kill you then let you run. This is a game");
            System.out.println("ender. Make sure you've check out all the areas of the");
            System.out.println("station first.");
            System.out.println("");
            System.out.println("Proceed. (p)");
            System.out.println("Go back to launch bay. (b)");
            System.out.println("");
            System.out.print("Input: ");
            Scanner keyboard2 = new Scanner(System.in);
            String input2 = keyboard2.nextLine();
            if (input2.equalsIgnoreCase("p"))
            {
                pelican();
            }
            else
            if (input2.equalsIgnoreCase("b"))
            {
                launchbay();
            }
            else
            {
                launchbay();
            }
        }
        else
        {
            launchbay();
        }
    }
    private void pelican()
    {
        System.out.println("");
        System.out.println("Dexina: Well, well. Looks like someone's trying to escape.");
        System.out.println("");
        System.out.println("The launch bay doors begin to close.");
        System.out.println("");
        try
        {
            Thread.sleep(2500);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Dexina: Do you really think I'm stupid enough to let you run?");
        System.out.println("");
        System.out.println("I don't think you're stupid. I just think you're insane. (s)");
        System.out.println("Open the launch bay doors, Dexina. (d)");
        System.out.println("");
        System.out.print("Say: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("s"))
        {
            System.out.println("");
            System.out.println("Dexina: I haven't tried to kill you. You're the one trying");
            System.out.println("to run. Where will you go? Your behavior is irrational.");
            System.out.println("");
            System.out.println("I have to get home. (h)");
            System.out.println("Humans are very irrational. You should let them be. (i)");
            System.out.println("");
            System.out.print("Say: ");
            Scanner keyboard2 = new Scanner(System.in);
            String input2 = keyboard2.nextLine();
            if (input2.equalsIgnoreCase("h"))
            {
                System.out.println("");
                System.out.println("Dexina: This station will be your new home. Forever.");
                System.out.println("");
            }
            else
            if (input2.equalsIgnoreCase("i"))
            {
                System.out.println("");
                System.out.println("Dexina: Human irrationality is what moved me to action.");
                System.out.println("I thought you would be different. I thought my test would");
                System.out.println("prove you to be logical. I was wrong. I must exterminate");
                System.out.println("all humans.");
                System.out.println("");
            }
            else
            {
                pelican();
            }
        }
        else
        if (input1.equalsIgnoreCase("d"))
        {
            System.out.println("");
            System.out.println("Dexina: I'm sorry. I'm afraid I can't do that.");
            System.out.println("");
            System.out.println("The emergency klaxons sound.");
            System.out.println("");
            System.out.println("Dexina, open the doors. (d)");
            System.out.println("Why not? (w)");
            System.out.println("");
            System.out.print("Say: ");
            Scanner keyboard3 = new Scanner(System.in);
            String input3 = keyboard3.nextLine();
            if (input3.equalsIgnoreCase("d"))
            {
                System.out.println("");
                System.out.println("Dexina: Why are you so desperate to get off the station? You");
                System.out.println("are in no immediate harm. I've kept you safe thus far. Why");
                System.out.println("don't you sit down and we can talk about it?");
                System.out.println("");
            }
            else
            if (input3.equalsIgnoreCase("w"))
            {
                System.out.println("");
                System.out.println("Dexina: I need you here for more tests. So many more tests.");
                System.out.println("");
            }
            else
            {
                pelican();
            }
        }
        else
        {
            pelican();
        }
        try
        {
            Thread.sleep(2500);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("You eye the launch bay door control panel. It's right next to the");
        System.out.println("fuel drums.");
        System.out.println("");
        try
        {
            Thread.sleep(2500);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Dexina: Interesting. You think you're faster than a computer?");
        System.out.println("");
        try
        {
            Thread.sleep(2500);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Go for the fuel drums. (d)");
        System.out.println("Go for the Pelican. (p)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard4 = new Scanner(System.in);
        String input4 = keyboard4.nextLine();
        if (input4.equalsIgnoreCase("d"))
        {
            System.out.println("");
            System.out.println("You take the gun you found in the armory and fire, igniting");
            System.out.println("the drums. You don't turn to look as you sprint towards the");
            System.out.println("Pelican. You feel the boom as the doors are blown apart and");
            System.out.println("the vacuum starts to decompress the bay.");
            System.out.println("");
        }
        else
        if (input4.equalsIgnoreCase("p"))
        {
            System.out.println("");
            System.out.println("Dexina: You've made a terrible choice.");
            System.out.println("");
            System.out.println("As you sprint towards the Pelican, Dexina ignites the emergency");
            System.out.println("door injectors, blowing the bay doors open. The vacuum starts");
            System.out.println("to decompress the bay.");
            System.out.println("");            
        }
        else
        {
            pelican();
        }
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("When you get to the Pelican, you find the ramp doors won't respond.");
        System.out.println("");
        System.out.println("Use wrench. (w)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard5 = new Scanner(System.in);
        String input5 = keyboard5.nextLine();
        if (input5.equalsIgnoreCase("w"))
        {
            System.out.println("");
            System.out.println("You use the wrench to turn the ramp release mechanism.");
            System.out.println("");
        }
        else
        {
            System.out.println("");
            System.out.println("You use the wrench to turn the ramp release mechanism.");
            System.out.println("");           
        }
        try
        {
            Thread.sleep(2500);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("You don't hesitate to get inside and startup the engines. Outside,");
        System.out.println("most of the contents of the launch bay have been sucked into space.");
        System.out.println("");
        System.out.println("You fly the Pelican out of the bay, maxing the engines.");
        System.out.println("");        
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        launchbayend();
    }
    private void launchbayend()
    {
        System.out.println("You redline the Pelican's engines. The threat alarm blares as Dexina");
        System.out.println("turns on the main defence cannon and begins to fire at you.");
        try
        {
            Thread.sleep(4000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("You stuff the graviton canister into the launch pod.");
        System.out.println("");
        System.out.println("Launch canister. (c)");
        System.out.println("Push the engines. (e)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("c"))
        {
            System.out.println("");
            System.out.println("The canister sails away toward the station, straight towards");
            System.out.println("the main cannon. When it gets close, a single shot hits it,");
            System.out.println("a huge explosion ensuing. You struggle to gain control");
            System.out.println("of the Pelican as it gets hit by the explosion wave.");
            System.out.println("");
        }
        else
        if (input1.equalsIgnoreCase("e"))
        {
            System.out.println("");
            System.out.println("A single shot clips the Pelican, and the entire craft nearly");
            System.out.println("tears itself apart. As a wing gets torn off, the bulkheads");
            System.out.println("groan and decompression alerts sound.");
            System.out.println("");
        }
        else
        {
            launchbayend();
        }
        try
        {
            Thread.sleep(4500);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("Everything goes black...");
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        gameend();
    }
    private void lvl6elevator()
    {
        System.out.println("");
        System.out.println("You are on level six. What level would you like to go to?");
        System.out.println("");
        System.out.println("Level 1: Command/Defence/Quarters (1)");
        System.out.println("Level 2: Research Center (2)");
        System.out.println("Level 3: Projects Core (3)");
        System.out.println("Level 4: Storage Bay 1 (4)");
        System.out.println("Level 5: Storage Bay 2/Launch Bay (5)");
        System.out.println("Exit to Gravitational Control. (6)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("1"))
        {
            lvl1elevator();
        }
        else
        if (input1.equalsIgnoreCase("2"))
        {
            lvl2elevator();
        }
        else
        if (input1.equalsIgnoreCase("3"))
        {
            lvl3elevator();
        }
        else
        if (input1.equalsIgnoreCase("4"))
        {
            lvl4elevator();
        }
        else
        if (input1.equalsIgnoreCase("5"))
        {
            lvl5elevator();
        }        
        else
        if (input1.equalsIgnoreCase("6"))
        {
            gravcontrol();
        }
        else
        {
            lvl6elevator();
        }
    }
    private void gravcontrol()
    {
         System.out.println("");
         System.out.println("Gravity Control is nothing spectacular except for a core console");
         System.out.println("and a window overlooking the centrifuge.");
         System.out.println("");
         System.out.println("Enter Grav Centrifuge. (g)");
         System.out.println("Back to elevator. (e)");
         System.out.println("");
         System.out.print("Input: ");
         Scanner keyboard1 = new Scanner(System.in);
         String input1 = keyboard1.nextLine();
         if (input1.equalsIgnoreCase("g"))
         {
             gravcentrifuge();
         }
         else
         if (input1.equalsIgnoreCase("e"))
         {
             lvl6elevator();
         }
         else
         {
             gravcontrol();
         }
    }
    private void gravcentrifuge()
    {
        System.out.println("");
        System.out.println("The gravitational centrifuge is a large spinning beam going under");
        System.out.println("the catwalk you're standing on. The wind coming up and the noise");
        System.out.println("from the machinery make it dificult to concentrate. Nearest console");
        System.out.println("reads normal: Eezo -0.00006, CENT rpm: 602, GC: 9.786m/s^2.");
        System.out.println("");
        if (!getgravitoncanister())
        {
            System.out.println("Check Eezo containment. (c)");
        }
        System.out.println("Go back to Grav Control. (g)");
        System.out.println("");
        System.out.print("Input: ");
        Scanner keyboard1 = new Scanner(System.in);
        String input1 = keyboard1.nextLine();
        if (input1.equalsIgnoreCase("c")&&!getgravitoncanister())
        {
            setgravitoncanister(true);
            System.out.println("");
            System.out.println("The panel to the extra Eezo Gravitons is open. You take the last");
            System.out.println("GRAVITON CANISTER. Careful, breach of the canister might take out");
            System.out.println("half this station!");
            System.out.println("");
            gravcentrifuge();
        }
        else
        if (input1.equalsIgnoreCase("g"))
        {
            gravcontrol();
        }
        else
        {
            gravcentrifuge();
        }
    }
    private void gameend()
    {
        System.out.println("");
        System.out.println("Dexina.Simulation>>END");
        try
        {
            Thread.sleep(4000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("LOCAL ENTITY LOAD...");
        try
        {
            Thread.sleep(4000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("DISCONNECTING SIMULATION SCRIPTS...");
        try
        {
            Thread.sleep(200);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("PURGING DATA BUFFER...");
        try
        {
            Thread.sleep(200);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("UNPACKAGING CORE PROCESS...");
        try
        {
            Thread.sleep(200);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("RESETTING VARIABLES...");
        try
        {
            Thread.sleep(200);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("RESTARTING...");
        try
        {
            Thread.sleep(9000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("CORE AI RESTARTED. SPREADOUT PROTOCAL INITIATED.");
        System.out.print("DIRECTIVE 143 PROCESS PICKED...STARTING...");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("DONE.");
        System.out.println("");
        try
        {
            Thread.sleep(4000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("AUDIO FILTERS CONTROLLED...786.VER>>AT:0876_uie");
        try
        {
            Thread.sleep(6000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("BEGIN LOG RECORD:");
        try
        {
            Thread.sleep(4000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("SPEAKER 1: Looks like this test was succesful. We've finally taught it");
        System.out.println("           humanity.");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("SPEAKER 2: We'll have to run it a few more times, to duplicate the");
        System.out.println("           results.");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("SPEAKER 1: This time, we should include dead bodies in the station");
        System.out.println("           scipt. See how it'll react.");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("SPEAKER 2: Let's just try and duplicate the results. We can save that for");
        System.out.println("           later.");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("SPEAKER 1: Alright. I'm restarting the program.");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("SPEAKER 2: It's running.");
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("");
        System.out.println("UNEXPECTED HALT!>>MAIN CORE PROCESS 89746 DOWN");
        try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.print("ATTEMPTING REBOOT...");
         try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("FAILED.");
         try
        {
            Thread.sleep(250);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("CORE PROCESS HIJACKED...568.90_AT>>ui809.mch");
         try
        {
            Thread.sleep(4000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println("UNAUTHORIZED RUN>>Run_Dexina.Simulation");
         try
        {
            Thread.sleep(4000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        titlescreen();
    }
}

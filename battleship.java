//Author Derek Wong
//First compiled Saturday, 11-13-10, 2:51 PM
//Last compiled: Tuesday, 11-16-10, 8:35 PM
//Total time spent ~ 6 hrs total (3 drafts)
//SIG.Semper Invicta

import java.util.*;
public class battleship
{ 
    private ArrayList<String> atlas = new ArrayList<String>();
    private ArrayList<String> leviathan = new ArrayList<String>();
    private ArrayList<String> amber = new ArrayList<String>();
    private ArrayList<String> pillar = new ArrayList<String>();
    private ArrayList<String> point = new ArrayList<String>();
    private int numofguesses;
    public battleship()
    {       
    }
    public static void main(String[]args)
    {
        battleship execute = new battleship();
        execute.introduction();
        execute.setup();
        execute.input();       
    }
    public void battlemodified()
    {
        battleship execute = new battleship();
        execute.introduction();
        execute.setup();
        execute.input();       
    }
    private void introduction() //based off of Halo universe canon. All refrences are property of Bungie and Microsoft Game Studios. Please don't sue my ass.
    {
        System.out.println(" _    _  _   _   _____   _____  _____   ______");
        System.out.println("| |  | || \\ | | / ____| / ____||  __ \\ |  ____|");
        System.out.println("| |  | ||  \\| || (___  | |     | |  | || |__");
        System.out.println("| |  | ||   ` | \\___ \\ | |     | |  | ||  __|"); 
        System.out.println("| |__| || |\\  | ____) || |____ | |__| || |"); 
        System.out.println(" \\____/ |_| \\_||_____/  \\_____||_____/ |_|");
        System.out.println("   CAIRO STATION ORBITAL DEFENSE STATION  ");
        System.out.println("                  ODA-142                 ");
        System.out.println(">>");
        System.out.println(">> Loading TCC...Pilot Program Found");
        System.out.println(">>");
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println(">> Loading local AI...Standby");
        System.out.println(">>");
        try
        {
            Thread.sleep(800);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println(">> Welcome to the Cairo Station MAC Manual Input Training Program.");
        System.out.println(">>");
        System.out.println(">Lysithea< This is local AI Lysithea. I've been ordered out of my shell");
        System.out.println(">> space from FLEETCOM to personally oversee your training. In the event");
        System.out.println(">> Earth comes under attack, you'll be manning our main defense gun. If");
        System.out.println(">> the automatic targeting package goes down, I need to make sure you");
        System.out.println(">> know how to input coordinates maunally.");
        System.out.println(">>");
        System.out.println(">> Let's get started.");
        System.out.println(">>");
        System.out.println(">> Please Wait...");
        System.out.println(">>");
        try
        {
            Thread.sleep(12000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println(">> Parameters: You'll be gunning for five cloaked ships:");
        System.out.println(">>");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println(">> UNSC Carrier ATLAS (5 Grid Units)");
        System.out.println(">> UNSC Marathon-Class Cruiser LEVIATHAN (4 Grid Units)");
        System.out.println(">> UNSC Frigate IN AMBER CLAD (3 Grid Units)");
        System.out.println(">> UNSC Halcyon-Class Cruiser PILLAR OF AUTUMN (3 Grid Units)");
        System.out.println(">> UNSC Prowler POINT OF NO RETURN (2 Grid Units)");
        System.out.println(">>");
        System.out.println(">> Loading...");
        System.out.println(">>");
        try
        {
            Thread.sleep(12000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println(">> The field grid is 10 units by 10 units, going left to right 1 to 10");
        System.out.println(">> and up to down A to J. Like so:");
        System.out.println(">>");
        System.out.println(">>    1 2 3 4 5 6 7 8 9 10");
        System.out.println(">>  A");
        System.out.println(">>  B   Potential Target");
        System.out.println(">>  C           |");
        System.out.println(">>  D           ");
        System.out.println(">>  E           O");
        System.out.println(">>  F           O");
        System.out.println(">>  G           O");
        System.out.println(">>  H");
        System.out.println(">>  I");
        System.out.println(">>  J");
        System.out.println(">>");
        System.out.println(">> Please Wait...");
        System.out.println(">>");
        try
        {
            Thread.sleep(10000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println(">Lysithia< May I remind you that the Cairo Station Magnetic Accelerator");
        System.out.println(">> Cannon can fire a 3000 ton ferric-tungston round to .04ths the speed");
        System.out.println(">> of light. That's approxmiately 12,000 kilometers a second. Even though");
        System.out.println(">> this is just a simulation, try not to miss. Those rounds are awfully");
        System.out.println(">> expensive.");
        System.out.println(">>");
        System.out.println(">> Running simulation scripts...Please Wait");
        System.out.println(">>");
        try
        {
            Thread.sleep(10000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Thread Interrupted!"+ie);
        }
        System.out.println(">> MAC loaded and charged! Happy Hunting!");
        System.out.println(">>");
    }
    private void setup()
    {
        ///////////////////////////////////////////////////SHIP STATUS
        boolean atlasfound = false;
        boolean leviathanfound = false; //If false, the ship has not been placed.
        boolean amberfound = false;
        boolean pillarfound = false;
        boolean pointfound = false;
        ////////////////////////////////////////////////////GRID
        String [][] grid = {
                {"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10"},
                {"B1","B2","B3","B4","B5","B6","B7","B8","B9","B10"},
                {"C1","C2","C3","C4","C5","C6","C7","C8","C9","C10"},
                {"D1","D2","D3","D4","D5","D6","D7","D8","D9","D10"},
                {"E1","E2","E3","E4","E5","E6","E7","E8","E9","E10"},
                {"F1","F2","F3","F4","F5","F6","F7","F8","F9","F10"},
                {"G1","G2","G3","G4","G5","G6","G7","G8","G9","G10"},
                {"H1","H2","H3","H4","H5","H6","H7","H8","H9","H10"},
                {"I1","I2","I3","I4","I5","I6","I7","I8","I9","I10"},
                {"J1","J2","J3","J4","J5","J6","J7","J8","J9","J10"},
            };
        ///////////////////////////////////////////////////ATLAS
        while (!atlasfound)
        {
            ArrayList<String> up = new ArrayList<String>(); //Creates a new array for all directions of origin point
            ArrayList<String> down = new ArrayList<String>();
            ArrayList<String> left = new ArrayList<String>();
            ArrayList<String> right = new ArrayList<String>();
            Random generator = new Random();
            int row = generator.nextInt(9); //Generates origin point,(-y,x+)
            int number = generator.nextInt(9);       
            for (int a=0;;a++)
            {
                if(up.contains(grid[0][number])) //Quits the fill loop if at an edge
                {
                    break;
                }              
                up.add(grid[row-a][number]); //Fills arraylist of the coordinates directly north of the origin
            }
            for (int b=0;;b++)
            {
                if(down.contains(grid[9][number])) 
                {
                    break;
                }      
                down.add(grid[row+b][number]); //Fills for coordinates south of origin
            }
            for (int c=0;;c++)
            {
                if(left.contains(grid[row][0]))
                {
                    break;
                } 
                left.add(grid[row][number-c]); //Fills for coordinates left of origin
            }
            for (int d=0;;d++)
            {
                if(right.contains(grid[row][9]))
                {
                    break;
                }  
                right.add(grid[row][number+d]); //Fills for coordinates right of origin
            }       
            //System.out.println(grid[row][number]);  //Prints origin point
            //System.out.println(up);  //Prints repsective coordinates up, down, left, and right of origin point
            //System.out.println(down);
            //System.out.println(left);
            //System.out.println(right);
            for (int search = 0;search<200;search++)
            {
                if (left.size()>=5&&!left.contains("s")) //If the filled left array is bigger than or equal to the ships's size 5), and is not marked, it is free
                {
                    for (int e=0;e<5;e++)
                    {
                        atlas.add(grid[row][number-e]); //If coordinates are free, the ship's ArrayList is filled with the free coordinate spaces
                        grid[row][number-e] = "s"; //Same coordinates are marked on the original grid to prevent future ships from taking the same spots
                    }
                    break;
                }            
                if (up.size()>=5&&!up.contains("s")) //If the left coordinates are not free, checks for spaces north of origin point
                {
                    for (int f=0;f<5;f++)
                    {
                        atlas.add(grid[row-f][number]);
                        grid[row-f][number] = "s";
                    }
                    break;
                }
                if (right.size()>=5&&!right.contains("s")) //Repeats for coordinates right
                {
                    for (int g=0;g<5;g++)
                    {
                        atlas.add(grid[row][number+g]);
                        grid[row][number+g] = "s";
                    }
                    break;
                }
                if (down.size()>=5&&!down.contains("s")) //Repeats for coordinates south
                {
                    for (int h=0;h<5;h++)
                    {
                        atlas.add(grid[row+h][number]);
                        grid[row+h][number] = "s";
                    }
                    break;
                }      
            }
            //System.out.println(atlas); //Print Atlas coordinates
            if (atlas.size()==5&&!atlas.contains("s"))
            {
                System.out.println(">> ATLAS randomnize successful."); //If the ship array is successfully filled, printline
                atlasfound = true; //Because the ship has been "placed", the boolean is now true
                break; //Ship is placed, so the search loop breaks
            }
            else
            {
                System.out.println(">> Randomnization failed, re-running."); //Process will sometimes never turn up appropiate coordinates due to ships already in the way,etc.
            }                                                                //If so, the search process repeats
        }
        //////////////////////////////////////////////LEVIATHAN 
        while (!leviathanfound) //Code repeats for Leviathan. Only variable names change. Otherwise, the code is identical. 
        {
            ArrayList<String> up1 = new ArrayList<String>();
            ArrayList<String> down1 = new ArrayList<String>();
            ArrayList<String> left1 = new ArrayList<String>();
            ArrayList<String> right1 = new ArrayList<String>();
            Random generator1 = new Random();
            int row1 = generator1.nextInt(9);
            int number1 = generator1.nextInt(9);       
            for (int i=0;;i++)
            {
                if(up1.contains(grid[0][number1]))
                {
                    break;
                }              
                up1.add(grid[row1-i][number1]);
            }
            for (int j=0;;j++)
            {
                if(down1.contains(grid[9][number1]))
                {
                    break;
                }      
                down1.add(grid[row1+j][number1]);
            }
            for (int k=0;;k++)
            {
                if(left1.contains(grid[row1][0]))
                {
                    break;
                } 
                left1.add(grid[row1][number1-k]);
            }
            for (int l=0;;l++)
            {
                if(right1.contains(grid[row1][9]))
                {
                    break;
                }  
                right1.add(grid[row1][number1+l]);
            }       
            //System.out.println(grid[row][number]); 
            //System.out.println(up);
            //System.out.println(down);
            //System.out.println(left);
            //System.out.println(right);
            for (int search1 = 0;search1<200;search1++)
            {       
                if (left1.size()>=4&&!left1.contains("s"))
                {
                    for (int m=0;m<4;m++)
                    {
                        leviathan.add(grid[row1][number1-m]);
                        grid[row1][number1-m] = "s";
                    }
                    break;
                }            
                if (up1.size()>=4&&!up1.contains("s"))
                {
                    for (int n=0;n<4;n++)
                    {
                        leviathan.add(grid[row1-n][number1]);
                        grid[row1-n][number1] = "s";
                    }
                    break;
                }
                if (right1.size()>=4&&!right1.contains("s"))
                {
                    for (int o=0;o<4;o++)
                    {
                        leviathan.add(grid[row1][number1+o]);
                        grid[row1][number1+o] = "s";
                    }
                    break;
                }  
                if (down1.size()>=4&&!down1.contains("s"))
                {
                    for (int p=0;p<4;p++)
                    {
                        leviathan.add(grid[row1+p][number1]);
                        grid[row1+p][number1] = "s";
                    }
                    break;
                }      
            }
            //System.out.println(leviathan); //Print Leviathan coordinates
            if (leviathan.size()==4&&!leviathan.contains("s"))
            {
                System.out.println(">> LEVIATHAN randomnize successful.");
                leviathanfound = true;
                break;
            }
            else
            {
                System.out.println(">> Randomnization failed, re-running.");
            }
        }
        ///////////////////////////////////////////////AMBER
        while (!amberfound) //Code repeats for Amber
        {
            ArrayList<String> up2 = new ArrayList<String>();
            ArrayList<String> down2 = new ArrayList<String>();
            ArrayList<String> left2 = new ArrayList<String>();
            ArrayList<String> right2 = new ArrayList<String>();
            Random generator2 = new Random();
            int row2 = generator2.nextInt(9);
            int number2 = generator2.nextInt(9);       
            for (int q=0;;q++)
            {
                if(up2.contains(grid[0][number2]))
                {
                    break;
                }              
                up2.add(grid[row2-q][number2]);
            }
            for (int r=0;;r++)
            {
                if(down2.contains(grid[9][number2]))
                {
                    break;
                }      
                down2.add(grid[row2+r][number2]);
            }
            for (int s=0;;s++)
            {
                if(left2.contains(grid[row2][0]))
                {
                    break;
                } 
                left2.add(grid[row2][number2-s]);
            }
            for (int t=0;;t++)
            {
                if(right2.contains(grid[row2][9]))
                {
                    break;
                }  
                right2.add(grid[row2][number2+t]);
            }       
            //System.out.println(grid[row][number]); 
            //System.out.println(up);
            //System.out.println(down);
            //System.out.println(left);
            //System.out.println(right);
            for (int search2 = 0;search2<200;search2++)
            {
                if (left2.size()>3&&!left2.contains("s"))
                {
                    for (int u=0;u<3;u++)
                    {
                        amber.add(grid[row2][number2-u]);
                        grid[row2][number2-u] = "s";
                    }
                    break;
                }     
                if (up2.size()>=3&&!up2.contains("s"))
                {
                    for (int v=0;v<3;v++)
                    {
                        amber.add(grid[row2-v][number2]);
                        grid[row2-v][number2] = "s";
                    }
                    break;
                }
                if (right2.size()>=3&&!right2.contains("s"))
                {
                    for (int w=0;w<3;w++)
                    {
                        amber.add(grid[row2][number2+w]);
                        grid[row2][number2+w] = "s";
                    }
                    break;
                }         
                if (down2.size()>=3&&!down2.contains("s"))
                {
                    for (int x=0;x<3;x++)
                    {
                        amber.add(grid[row2+x][number2]);
                        grid[row2+x][number2] = "s";
                    }
                    break;
                }      
            }
            //System.out.println(amber); //Print Amber coordinates
            if (amber.size()==3&&!amber.contains("s"))
            {
                System.out.println(">> AMBER randomnize successful.");
                amberfound = true;
                break;
            }
            else
            {
                System.out.println(">> Randomnization failed, re-running.");
            }
        }
        ///////////////////////////////////////PILLAR
        while (!pillarfound) //Code repeats for Pillar
        {
            ArrayList<String> up3 = new ArrayList<String>();
            ArrayList<String> down3 = new ArrayList<String>();
            ArrayList<String> left3 = new ArrayList<String>();
            ArrayList<String> right3 = new ArrayList<String>();
            Random generator3 = new Random();
            int row3 = generator3.nextInt(9);
            int number3 = generator3.nextInt(9);       
            for (int a1=0;;a1++)
            {
                if(up3.contains(grid[0][number3]))
                {
                    break;
                }              
                up3.add(grid[row3-a1][number3]);
            }
            for (int b1=0;;b1++)
            {
                if(down3.contains(grid[9][number3]))
                {
                    break;
                }      
                down3.add(grid[row3+b1][number3]);
            }
            for (int c1=0;;c1++)
            {
                if(left3.contains(grid[row3][0]))
                {
                    break;
                } 
                left3.add(grid[row3][number3-c1]);
            }
            for (int d1=0;;d1++)
            {
                if(right3.contains(grid[row3][9]))
                {
                    break;
                }  
                right3.add(grid[row3][number3+d1]);
            }       
            //System.out.println(grid[row][number]); 
            //System.out.println(up);
            //System.out.println(down);
            //System.out.println(left);
            //System.out.println(right);
            for (int search3 = 0;search3<200;search3++)
            {
                if (left3.size()>=3&&!left3.contains("s"))
                {
                    for (int e1=0;e1<3;e1++)
                    {
                        pillar.add(grid[row3][number3-e1]);
                        grid[row3][number3-e1] = "s";
                    }
                    break;
                }     
                if (up3.size()>=3&&!up3.contains("s"))
                {
                    for (int f1=0;f1<3;f1++)
                    {
                        pillar.add(grid[row3-f1][number3]);
                        grid[row3-f1][number3] = "s";
                    }
                    break;
                }
                if (right3.size()>=3&&!right3.contains("s"))
                {
                    for (int g1=0;g1<3;g1++)
                    {
                        pillar.add(grid[row3][number3+g1]);
                        grid[row3][number3+g1] = "s";
                    }
                    break;
                }         
                if (down3.size()>=3&&!down3.contains("s"))
                {
                    for (int h1=0;h1<3;h1++)
                    {
                        pillar.add(grid[row3+h1][number3]);
                        grid[row3+h1][number3] = "s";
                    }
                    break;
                }      
            }
            //System.out.println(pillar); //Print Pillar coordinates
            if (pillar.size()==3&&!pillar.contains("s"))
            {
                System.out.println(">> PILLAR randomnize successful.");
                pillarfound = true;
                break;
            }            
            else
            {
                System.out.println(">> Randomnization failed, re-running.");
            }
        }
        /////////////////////////////////////////POINT
        while (!pointfound) //Code repeats for Point
        {
            ArrayList<String> up4 = new ArrayList<String>();
            ArrayList<String> down4 = new ArrayList<String>();
            ArrayList<String> left4 = new ArrayList<String>();
            ArrayList<String> right4 = new ArrayList<String>();
            Random generator4 = new Random();
            int row4 = generator4.nextInt(9);
            int number4 = generator4.nextInt(9);       
            for (int i1=0;;i1++)
            {
                if(up4.contains(grid[0][number4]))
                {
                    break;
                }              
                up4.add(grid[row4-i1][number4]);
            }
            for (int j1=0;;j1++)
            {
                if(down4.contains(grid[9][number4]))
                {
                    break;
                }      
                down4.add(grid[row4+j1][number4]);
            }
            for (int k1=0;;k1++)
            {
                if(left4.contains(grid[row4][0]))
                {
                    break;
                } 
                left4.add(grid[row4][number4-k1]);
            }
            for (int l1=0;;l1++)
            {
                if(right4.contains(grid[row4][9]))
                {
                    break;
                }  
                right4.add(grid[row4][number4+l1]);
            }       
            //System.out.println(grid[row][number]); 
            //System.out.println(up);
            //System.out.println(down);
            //System.out.println(left);
            //System.out.println(right);
            for (int search4 = 0;search4<200;search4++)
            {
                if (left4.size()>=2&&!left4.contains("s"))
                {
                    for (int m1=0;m1<2;m1++)
                    {
                        point.add(grid[row4][number4-m1]);
                        grid[row4][number4-m1] = "s";
                    }
                    break;
                }     
                if (up4.size()>=2&&!up4.contains("s"))
                {
                    for (int n1=0;n1<2;n1++)
                    {
                        point.add(grid[row4-n1][number4]);
                        grid[row4-n1][number4] = "s";
                    }
                    break;
                }
                if (right4.size()>=2&&!right4.contains("s"))
                {
                    for (int o1=0;o1<2;o1++)
                    {
                        point.add(grid[row4][number4+o1]);
                        grid[row4][number4+o1] = "s";
                    }
                    break;
                }         
                if (down4.size()>=2&&!down4.contains("s"))
                {
                    for (int p1=0;p1<2;p1++)
                    {
                        point.add(grid[row4+p1][number4]);
                        grid[row4+p1][number4] = "s";
                    }
                    break;
                }      
            }
            //System.out.println(point); //Prints Point coordinates
            if (point.size()==2&&!point.contains("s"))
            {
                System.out.println(">> POINT randomnize successful.");
                pointfound = true;
                break;
            }
            else
            {
                System.out.println(">> Randomnization failed, re-running.");
            }
        }  
        if (atlasfound&&leviathanfound&&amberfound&&pillarfound&&pointfound) //When all ships are found, their booleans are all true, so:
        {
            System.out.println(">>\n>> All ships successfully placed...proceeding.\n>>");
        }
//         System.out.println(atlas); //To see ship coordinates
//         System.out.println(leviathan);
//         System.out.println(amber);
//         System.out.println(pillar);
//         System.out.println(point); 
    }      
    private void input()
    {       
        boolean over = true; 
        boolean atlasdown = false; //Checks to see if a ship is sunk or not, if boolean is true, the ship is sunk
        boolean leviathandown = false;
        boolean amberdown = false;
        boolean pillardown = false;
        boolean pointdown = false;
        System.out.println(">> Coordinate syntax: Capital Letter(A-J) + Number(1-10)");
        System.out.println(">> Examples: A1, B5, J9, F10");
        System.out.println(">> Be advised: incorrect inputs will register as a miss, along with");
        System.out.println(">> coordinates outside of game grid. Hitting a ship again on its");
        System.out.println(">> damaged grid spot will also register as a miss.");
        System.out.println(">>");
        while (over)
        {
            numofguesses++;    
            System.out.print(">> Enter Coordinates: ");
            Scanner keyboard = new Scanner(System.in);
            String input = keyboard.nextLine();
            if(atlas.contains(input)) //if the player's input is detected, the ship is broadcast as hit, and coordinates are removed from the appropiate array
            {
                System.out.println(">>");
                System.out.println(">> Carrier ATLAS hit!");
                System.out.println(">>");
                atlas.remove(input);
            }
            else
            if (leviathan.contains(input))
            {
                System.out.println(">>");
                System.out.println(">> Cruiser LEVIATHAN hit!");
                System.out.println(">>");
                leviathan.remove(input);
            }
            else
            if (amber.contains(input))
            {
                System.out.println(">>");
                System.out.println(">> Frigate IN AMBER CLAD hit!");
                System.out.println(">>");
                amber.remove(input);
            }
            else
            if (pillar.contains(input))
            {
                System.out.println(">>");
                System.out.println(">> Cruiser PILLAR OF AUTUMN hit!");
                System.out.println(">>");
                pillar.remove(input);
            }
            else
            if (point.contains(input))
            {
                System.out.println(">>");
                System.out.println(">> Prowler POINT OF NO RETURN hit!");
                System.out.println(">>");
                point.remove(input);
            }
            else
            {
                System.out.println(">>");  
                System.out.println(">> SHOT MISSED!"); //If no ships are hit, the shot is broadcast as a miss. 
                System.out.println(">>");              //Note that any input not following the right input format will show up automatically as a miss.
            }
            if (atlas.isEmpty()&&!atlasdown) //if the ship's array is empty, it's demise is printed and the appropiate sunk boolean is set to true
            {               
                System.out.println(">TACCOM< UNSC ATLAS destroyed!");
                System.out.println(">Lysithia< Not bad. But I've seen better.");
                System.out.println(">>");
                atlasdown = true;
            }
            if (leviathan.isEmpty()&&!leviathandown)
            {
                System.out.println(">TACCOM< UNSC LEVIATHAN  destroyed!");
                System.out.println(">Lysithia< Ship combat rating reduced to 4.2%. Nicely done.");
                System.out.println(">>");
                leviathandown = true;
            }
            if (amber.isEmpty()&&!amberdown)
            {
                System.out.println(">TACCOM< UNSC IN AMBER CLAD destroyed!");
                System.out.println(">Lysithia< Clean shot through the reactor. I'm impressed.");
                System.out.println(">>");
                amberdown = true;
            }
            if (pillar.isEmpty()&&!pillardown)
            {
                System.out.println(">TACCOM< UNSC PILLAR OF AUTUMN destroyed!");
                System.out.println(">Lysithia< Not many can take out a Halcyon-class crusier with 3 hits.");
                System.out.println(">> Very impressive.");
                System.out.println(">>");
                pillardown = true;
            }
            if (point.isEmpty()&&!pointdown)
            {
                System.out.println(">TACCOM< UNSC POINT OF NO RETURN destroyed!");
                System.out.println(">Lysithia< Pesky little ship, but no match for pure kinetic energy.");
                System.out.println(">>");
                pointdown = true;
            }
            if (atlasdown&&leviathandown&&amberdown&&pillardown&&pointdown) //if all ship booleans register as true, they are all sunk and loop exits
            {
                break;
            }
        }        
        gameend(); //Results screen 
    }
    private void gameend()
    {
        if (numofguesses<=50) //If all ships are hit on the first try, the minimum amount of hits is 17
        {
            System.out.println(">> Simulation concluded. "+numofguesses+" hits registered.");
            System.out.println(">>");
            System.out.println(">Lysithia< Not bad for a trainee. Try and beat Admiral Stanforth's");
            System.out.println(">> record of 19 hits. Have you got what it takes?");
        }
        if (numofguesses>50)
        {
            System.out.println(">> Simulation concluded. "+numofguesses+" hits registered.");
            System.out.println(">>");
            System.out.println(">Lysithia< What did I tell you about wasting shots? Were you");
            System.out.println(">> randomly entering coordinates with no foresight? Just so");
            System.out.println(">> you know, each shot costs about 15000 credits. In a real");
            System.out.println(">> combat situation, you would have just lost us "+(15000*numofguesses)+" creds,");
            System.out.println(">> not to mention the same amount of lives on the surface.");
        }
    }
}

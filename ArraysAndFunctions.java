import java.util.Scanner;

public class ArraysAndFunctions {
		//-----------------------------1st Function (Question 19 Chapter 5)------------------------------------//
		public static int[] multiplyNumbers(int[] arr1, int[] arr2){
		
		int flag = 0;
		int w = 0;
		int sum = 0;
		int finalSum = 0;
		int i = arr1.length-1;
		int j = arr2.length-1;
		int z = 1;
		int t = 1;
		int factorial = 0;
		int digitCounter = 0;
		
		
		for(j=arr2.length-1;j>=0;j--){
			for(i=arr1.length-1 ; i >= 0; i--){
				flag = arr1[i]*arr2[j] + factorial;
				w = flag%10;
				if(i != 0){
				 sum += w*z;
				}
				else{
				sum += flag*z;
				}
			factorial = (flag-flag%10)/10;
			z*=10;
			}
				finalSum += sum;
				sum=0;
				t*=10;
				z=t;
				factorial = 0;
				flag = 0;
				w = 0;
		}
		
		//-----Create a New Array--------//
		i=finalSum;
		while(i > 0){
			i/=10;
			digitCounter++;
		}
		
		int[] arr3 = new int[digitCounter];
		
		for(i = arr3.length-1 ; i >= 0 ; i--){
			arr3[i] = finalSum%10;
			finalSum/=10;
		}
		
		return arr3;
	}

		//------------------------------------2nd Function (Question 1 Chapter 6)----------------------------------//
		public static int flipFunc(int num){
			
			int i;
			int j = 1;
			int digitCounter = 0;
			int sum = 0;
			
			i=num;
			while(i > 0){
				i/=10;
				digitCounter++;
			}
			
			while(digitCounter>0){
				if((num%10)+1 == 10){
					sum+=0*j;
					num/=10;
					j*=10;
					digitCounter--;
				}
				else{
					sum+=j*((num%10)+1);
					num/=10;
					j*=10;
					digitCounter--;
				}
			}
			return sum;
		}
		
		
		//------------------------------------3rd Functions (Question 3 Chapter 6)----------------------------------//
		//-------Functions 1---------//
		public static int countDigit(int num){
			int i;
			int digitCounter = 0;
			int sum = 0;
			
			i=num;
			while(i > 0){
				i/=10;
				digitCounter++;
			}
			
			while(digitCounter>0){
				sum+=num%10;
				num/=10;		
				digitCounter--;
			}
			return sum;	
		}
		//-------Functions 2---------//
		public static int checkTheSum(int[] arr, int length){
			
			int i;
			int sum = 0;
			
			for(i=0 ; i<length ; i++){
				if(countDigit(arr[i])==10){
					sum+=1;
				}
			}
			return sum;
		}

		//------------------------------------4th Functions (Question 7 Chapter 6)----------------------------------//
		
		public static int[] add(int[] array1, int[] array2){
			
			int i;
			int digitCounter = 0;
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			int z=1;
			
			for(i=array1.length-1 ; i >= 0 ; i--){
				num1 += (array1[i]%10)*z;
				z*=10;
			}
			
			z=1;
			for(i=array2.length-1 ; i >= 0 ; i--){
				num2 += (array2[i]%10)*z;
				z*=10;
			}
			
			num3 = num1+num2;
			System.out.printf("%d",num3);
			
			
			i=num3;
			while(i > 0){
				i/=10;
				digitCounter++;
			}
			
			int[] arrayNum = new int[digitCounter];
			
			for(i=arrayNum.length-1 ; i >= 0 ; i--){
				arrayNum[i] = num3%10;
				num3/=10;
			}
			return arrayNum;
		}

		//--------------------------------------------------------------------------------------Main-------------------------------------------------------------------------------------------//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		boolean checker = true;

		do{
			System.out.println("Hi! And Welcome to Shalev Lazarof Arrays And Functions Program\n\n"
					+ "Question 6 in Chapter 5: will Receive 10 Letters And Convert The Small Capital Letters\n"
					+ "                         From The First High Capital Letter To The Next After it >>> For This Question Press 56\n\n"
					+ "Question 7 in Chapter 5: will Check The First 10 Friendly Numbers, Two Friendly Numbers are\n"
					+ "                         2 Numbers That The Sum Of Their Deviders is Equel To The Other >>> For This Question Press 57\n\n"
					+ "Question 9 in Chapter 5: will Check if The Array is Mirrorles, Which Means\n"
					+ "                         That the Numbers Are The Same From Both Ends >>> For This Question Press 59\n\n"
					+ "Question 12 in Chapter 5: will Print A Matrix And Check Who is\n"
					+ "                          The Biggest Number >>> For This Question Press 512\n\n"
					+ "Question 13 in Chapter 5: will Receive 4 Numbers and Print '*' By Their\n"
					+ "                          Digit Ammount >>> For This Question Press 513\n\n"
					+ "Question 14 in Chapter 5: will Create a Snake Matrix By The Rows And\n"
					+ "                          Columns That You Will Enter >>> For This Question Press 514\n\n"
					+ "Question 19 in Chapter 5: will Receive 2 numbers and print The result of the multiplication\n"
					+ "                          of them, >>> For This Question Press 519 \n\n"
					+ "Question 1 in Chapter 6: will Receive a Number and Promot\n"
					+ "                         each digit by 1 >>> For this question press 61\n\n"
					+ "Question 3 in Chapter 6: will Receive a number and sum his digits,\n"
					+ "                         and, will recieve as many numbers as you choose and check if\n"
					+ "                         their sum equals 10 >>> For This Question Press 63 \n\n"
					+ "Question 7 in Chapter 6: will Receive 2 numbers and sum them >>> For This Question Press 67\n\n\n"
					+ "                         Please enter which question would you like, 0 to exit\n\n\n");
		
		System.out.printf("Please enter your choise:");
		int qNum = s.nextInt();
		
		switch(qNum){
		
		//-------Chapter 5 Question 6---------//
		case 56:{
			
			int flag = 0;
			int i,k;
			char[] charArr = new char[10];
			System.out.printf("Please enter 10 letters: ");
			
			//--------Receive Letters------//
			for(i =0 ; i<charArr.length; i++)
				charArr[i] = s.next().charAt(0);
			for(i = 0; i < charArr.length ; i++)
				if(65 < charArr[i] && charArr[i] < 97){
					if(flag == 1){
						break;
					}
					for(k = i + 1 ;k < charArr.length ; k++){
							if(k!=9)
							charArr[k] = (char) (charArr[k]-32);
							
						if(k + 1 < charArr.length){
							if(65 <= charArr[k+1] && charArr[k+1] <= 90 && k <= charArr.length){
							flag = 1;
							break;
							}
							i = k - 1;
						}
						
					}
				}
			for(i = 0; i < charArr.length ; i++){
				System.out.printf("%c ",charArr[i]);
			}
			System.out.printf("\n\n");
			break;
		}

		//-------Chapter 5 Question 7---------//
		case 57:{
			
			int num1 = 220;
			int num2 = 0;
			int sum = 0;
			int index = 0;
			int factorial = 3;
			int counter = 1;
			

			while (counter <= 10) {
				if (num1 != index) { 
					for (int i = 1; (factorial > 2) && (i != num1); i++) {
						if (num1 % i == 0) { 
							sum += i;
							factorial = num1 / i;
						}
					}
					if (sum != num1) { 
						num2 = sum;
						sum = 0;
						factorial = 3;
						for (int i = 1; (factorial > 2) && (i != num2); i++) {
							if (num2 % i == 0) {
								sum += i;
								factorial = num2 / i;
							}
						}
					} else {
						sum = 0;
					}

					if (sum == num1) {
						System.out.printf("%d) %d and %d are mates\n", counter, num1, num2);
						counter++;
						index = num2;
					}
				}

				num1++;
				sum = 0;
				factorial = 3;
			}
			System.out.printf("\n\n");
			break;
		
		}
		
		//-------Chapter 5 Question 9---------//
		case 59:{
			int[] mirrorArr = new int[10];
			int i = 0; 
			int k;
			int flag = 0;
			int lengthCheck = 0;
			int letterCounter = 0;
			int newNum1 = 0;
			int newNum2 = 0;
			double dMultiply = 0;
			int n = mirrorArr.length;
			
			//--------Receiving The Numbers-------------//
			System.out.printf("Please enter 10 numbers: ");
			for(int j = 0 ; j <= mirrorArr.length -1 ; j++){
				mirrorArr[j] = s.nextInt();
			}
			
			while(lengthCheck < n){
					//-------Counting The Letters----------//
					for(k = mirrorArr[i] ; 1 <= k ; k/=10){
						letterCounter++;
					}
						dMultiply = (Math.pow(10,letterCounter))/10;
					//-------Rearrange The Number----------//
					for(newNum2 = mirrorArr[i] ; 1 <= dMultiply ; dMultiply /= 10){
						newNum1 += newNum2%10 * dMultiply;
						newNum2 /= 10;
					}
					if(newNum1 != mirrorArr[mirrorArr.length-(i+1)] && i<=i/2){
						flag = 1;
						break;
					}
					dMultiply = 0;
					newNum1 = 0;
					letterCounter = 0;
					k = 0;
					i++;
					lengthCheck++;
			}
			//-------------------Print If The Array is Mirrorles Or Not-------------------------//
					if(flag != 1)
						System.out.printf("The Array is Mirrorles");
					else
						System.out.printf("The Array is Not Mirrorles");
					
					System.out.printf("\n\n\n");
					break;
		}
		
		//-------Chapter 5 Question 12---------//
		case 512:{
			int[][] matrix = new int[10][10];
			int rows = 0;
			int cols = 0;
			int maxNumber = 0;
			boolean flag = true;
			
			//-------------------Rows----------------------//
			System.out.printf("enter Rows--> ");
			do{
			rows = s.nextInt();
			if(10 < rows){
				flag = false;
				System.out.printf("Value should be between 1-10, try again--> ");
			}
			else 
				flag = true;
			}while(flag == false);
			
			flag = true;
			
			//---------------------Columns-----------------//
			System.out.printf("enter Cols--> ");
			do{
			cols = s.nextInt();
			if(10 < cols){
				flag = false;
				System.out.printf("Value should be between 1-10, try again--> ");
			}
			else 
				flag = true;
			}while(flag == false);
			
			System.out.printf("enter %d numbers: " , rows*cols);
			
			//----------Receive The Numbers From The User--------//
			for(int i = 0; i<rows ; i++){
				for(int j = 0; j < cols ; j++){
					matrix[i][j] = s.nextInt();
					if(maxNumber < matrix[i][j])
						maxNumber = matrix[i][j];
				}
			}
			//----------Print The Matrix--------//
			System.out.printf("The Matrix is:\n");
			
			for(int i = 0; i<rows ; i++){
				for(int j = 0; j < cols ; j++){
					System.out.printf("%4d ",matrix[i][j]);
				}
				System.out.printf("\n");
			}
			
			System.out.printf("The Maximum Number in The Matrix is: %d\n\n",maxNumber);
			System.out.printf("\n");
			break;
		}
		
		//-------Chapter 5 Question 13---------//
		case 513:{
			int[] arr = new int[4];
			int[] arr2 = new int[4];
			int[] arr3 = new int[4];
			int i = 0;
			int digitCounter = 0;
			int theBiggestNum = 0;
			
			//---------------Receive The Numbers From The User--------------//
			System.out.printf("Please Enter 4 Numbers: ");
			for(i = 0 ; i < arr.length ; i++){
				arr[i] = s.nextInt();
				arr2[i] = arr[i];
				if(arr[i] > theBiggestNum){
					theBiggestNum = arr[i];
				}
			}
			
			//----------------------Allocate The Matrix---------------------//
			char[][] arrMatrix = new char[theBiggestNum][4];
			
			//-----------------Fill The Matrix--------------------//
			for(int k = 0 ; k < 4 ; k++){
				for(int j = theBiggestNum-1 ; 0 < arr[k] ; j--){
					arrMatrix[j][k] = '*';
					arr[k]--;
				}	
			}
			
			//-----------------Print The Matrix------------------//
			for(i=0 ; i<theBiggestNum ; i++){
				for(int j=0 ; j<4 ; j++){
					if(arrMatrix[i][j]=='*'){
					System.out.printf("%c ",arrMatrix[i][j]);
					}
					else{
						System.out.printf("  ");	
					}
				}
				System.out.printf("\n");
			}
			
			for(i=0;i<arr.length;i++){
				arr3[i]=arr2[i];
			}
			
			//---------------Counting The Spaces-----------------//
			for(i=0;i<arr.length;i++){
				while(arr3[i]!=0){
					digitCounter++;
					arr3[i]/=10;
				}
			}
			
			//-----------Print The Numbers Formation-------------//
			for(i = 0 ; i < (digitCounter*2)+1 ; i++)
				System.out.printf("%c",'-');
		
			System.out.println("");
			
			for(i = 0 ; i < arr.length ; i++)
				System.out.printf("%1d ",arr2[i]);
			
				System.out.printf("\n\n");
				break;
		}
		
		//-------Chapter 5 Question 14---------//
		case 514:{
			int rows;
			int cols;
			int i,j;
			int index = 1;
			int factorial = 4;
			boolean flag = true;
			
			//-------------------Rows-------------------//
			do{
			rows = (int)(Math.random()*(8-5+1)+5);
			if(rows < 5 || 8 < rows){
				flag = false;
			}
			else 
				flag = true;
			}while(flag == false);
			
			//-------------------Columns----------------//
			do{
				cols = (int)(Math.random()*(8-5+1)+5);
				if(cols < 5 || 8 < cols){
					flag = false;
				}
				else 
					flag = true;
				}while(flag == false);
			
			//-----------------------------Allocate The Matrix-------------------------//
			int[][] matrix = new int[rows][cols]; 
			
			//-----------------------------Build The Matrix----------------------------//
			for(j = cols-1 ; j >= 0 ; j--){
					
					for(i = 0 ; i <= rows-1 ; i++){
						
						matrix[i][j] = index;
						index++;	
					}
					for( j--,i-- ; i >= 0 ; i--){
						if(j==-1 && i==rows-1){
							break;
						}
						matrix[i][j] = index;
						index++;	
					}
			}
			
			//-------------------------------Print The Matrix--------------------------//
			for(i = 0 ; i < rows ; i++){
				for(j=0 ; j < cols ; j++){
					System.out.printf("%4d ",matrix[i][j]);
				}
				System.out.printf("\n");
			}	
			System.out.printf("\n\n");
			break;
		}
		
		//---------Chapter 5 Question 19----------//
		case 519:{
			
			int num1;
			int num2;
			int i,j,k;
			int digitCounter1 = 0; 
			int digitCounter2 = 0; 
			int digitCounter3 = 0; 
			int result = 0;
			
			//---------First Number--------//
			System.out.printf("Please enter the FIRST number: ");
			num1 = s.nextInt();
			
			i=num1;
			while(i > 0){
				i/=10;
				digitCounter1++;
			}
			int[] arr1 = new int[digitCounter1];
			
			for(j=digitCounter1-1,i=num1; j >= 0 ;j--){
				arr1[j] = i%10;
				i/=10;
			}
			
			//---------Second Number--------//
			System.out.printf("Please enter the SECOND number: ");
			num2 = s.nextInt();
			
			j = num2;
			while(j > 0){
				j/=10;
				digitCounter2++;
			}
			int[] arr2 = new int[digitCounter2];
			
			for(j=digitCounter2-1,i=num2; j >= 0 ;j--){
				arr2[j] = i%10;
				i/=10;
			}

			//-------------Result--------------//
			result = num1*num2;
			k = result;
			while(k > 0){
				k/=10;
				digitCounter3++;
			}
			//---------Creating Array in the proper size from the digits size result-----------//	
			int[] arr3 = new int[digitCounter3];
			for(j=digitCounter3-1; j >= 0 ;j--){
				arr3[j] = 0;
			}
			//-----------------Sending the arrays to the function---------------//
			arr3 = multiplyNumbers(arr1,arr2);
			//--------------------------Print the number--------------------//
			for(i = 0;i < arr3.length ; i++){
				System.out.printf("%d",arr3[i]);
			}
			System.out.printf("\n\n");
		break;
		}
		
		//-------Chapter 6 Question 1---------//
		
		case 61:{
			
			int num;
			int newNum;
			
			System.out.printf("Please Enter a Number: ");
			num = s.nextInt();
			//----------Send The Number To The Function----------//
			newNum = flipFunc(num);
			
			System.out.printf("The New Number is: %d\n\n",newNum);
			break;
		}
		
		//-------Chapter 6 Question 3---------//
		case 63:{
			
			int num;
			int arraySize;
			System.out.printf("Please enter a number: ");
			num = s.nextInt();
			System.out.printf("digits sum is: %d",countDigit(num));
				
			System.out.printf("\nPlease enter how many numbers you would like to check: ");
			arraySize = s.nextInt();
			int[] array = new int[arraySize];
			
			System.out.printf("\nPlease enter the numbers: ");
			for(int i=0;i<array.length;i++){
				array[i] = s.nextInt();
			}
			
			System.out.printf("\nThe amount of numbers that their sum equals 10 are:%d \n\n",checkTheSum(array,arraySize));
			break;
		}
		
		//-------Chapter 6 Question 7---------//
		
		case 67:{
			
			int i;
			int num1;
			int num2;
			int num3;
			int digitCounter1 = 0;
			int digitCounter2 = 0;
			int digitCounter3 = 0;
			int flag = 0;
			//----------Receiving First Number----------//
			System.out.printf("Please enter the FIRST number: ");
			num1 = s.nextInt();
			flag+=num1;
			i = num1;
			while(i > 0){
				i/=10;
				digitCounter1++;
			}
			//-------Allocate The First Array------------//
			int[] arrayNum1 = new int[digitCounter1];
			for(i=arrayNum1.length-1;i>=0;i--){
				arrayNum1[i] = num1%10;
				num1/=10;
			}
			
			//--------------Receiving Second Number---------------//
			System.out.printf("Please enter the SECOND number: ");
			num2 = s.nextInt();
			flag+=num2;
			i = num2;
			while(i > 0){
				i/=10;
				digitCounter2++;
			}
			//-------Allocate The Second Array------------//
			int[] arrayNum2 = new int[digitCounter2];
			
			for(i=arrayNum2.length-1 ; i >= 0 ;i--){
				arrayNum2[i] = num2%10;
				num2/=10;
			}
			
			num3 = flag;
			i = num3;
			while(i > 0){
				i/=10;
				digitCounter3++;
			}
			//-------Allocate The Third Array------------//
			int[] arrayNum3 = new int[digitCounter3];
			//-------Send The Array To The function------//
			arrayNum3 = add(arrayNum1,arrayNum2);

			System.out.printf("\n\n");
			break;
		}
		case 0:{
			checker = false;
			break;
		}
		default:
			System.out.println("invalid number, try again please");
			break;
		}
		
		}while(checker);
	
	System.out.println("Thank you, Have a great day");
	}

	private static int pow(int i, int letterCounter) {
		// TODO Auto-generated method stub
		return 0;
	}

}
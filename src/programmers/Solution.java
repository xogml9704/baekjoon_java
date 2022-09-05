package programmers;

import java.util.Scanner;

public class Solution {
	static int AnsWerN;
	static int N = 10;
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		boolean run = true;
		
		for(int test_case = 1; test_case<=T; test_case++) {
			int x_x = 0;
			int x_y = 0;
			
			N = Integer.parseInt(sc.nextLine());
			
			String[][] pan = new String[N][N];
			for(int i=0; i<N; i++) {
				pan[i] = sc.nextLine().split(" ");
			}
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(pan[i][j].equals("X")) {
						x_x = j;
						x_y = i;
					}
				}
				
			}
			while(run) {
				case1 : for(int i=x_x; i<N; i++) {
					if(pan[x_y][i].equals("Y")) {
						break;
					} else if(pan[x_y][i].equals("H")) {
							if(pan[x_y][i+1].equals("Y")) {
								break case1;
							} else if(pan[x_y][i+1].equals("H")) {
								x_x = i+1;
								pan[x_y][i+1] = "L";
								AnsWerN++;
							}
					}
				}
				case2 : for(int i=x_x; i>0; i--) {
					if(pan[x_y][i].equals("Y")) {
						break;
					}else if(pan[x_y][i].equals("H")) {
							if(pan[x_y][i-1].equals("Y")) {
								break case2;
							} else if(pan[x_y][i-1].equals("H")) {
								x_x = i-1;
								pan[x_y][i-1] = "L";
								AnsWerN++;
							}
					}
				}
				case3 : for(int i=x_y; i<N; i++) {
					if(pan[i][x_x].equals("Y")) {
						break;
					}else if(pan[i][x_x].equals("H")) {
							if(pan[i+1][x_x].equals("Y")) {
								break case3;
							} else if(pan[i+1][x_x].equals("H")) {
								x_y = i+1;
								pan[i+1][x_x] = "L";
								AnsWerN++;
							}

					}
				}
				case4 : for(int i=x_y; i>0; i--) {
					if(pan[i][x_x].equals("Y")) {
						break;
					} else if(pan[i][x_x].equals("H")) {
							if(pan[i-1][x_x].equals("Y")) {
								break case4;
							} else if(pan[i-1][x_x].equals("H")) {
								x_y = i-1;
								pan[i-1][x_x] = "L";
								AnsWerN++;
							}
					}
				}
				break;
			}
			System.out.println("#"+test_case+" "+AnsWerN);
			AnsWerN = 0;
		}
		
	}

}

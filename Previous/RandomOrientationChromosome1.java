			
			//xy variables
			int tempX=0;
			int tempY=0;


			int firstChoice = rn.nextInt(3)+1;
			int secondChoice = 6 - firstChoice;
			int thirdChoice = 6 - firstChoice - secondChoice;

			//previous direction = 1
			if(previousDirection == 1){
				if(firstChoice==1){
					tempX += 1;
					tempDirection = 1;
				}//end if
				if(firstChoice == 2){
					tempY += -1;
					tempDirection = 2;
				}
				if(firstChoice == 3){
					tempY += 1;
					tempDirection = 4;
				}
			}

			//previous direction = 2
			if(previousDirection == 2){
				if(firstChoice==1){
					tempX += 1;
					tempDirection = 1;
				}//end if
				if(firstChoice == 2){
					tempY += -1;
					tempDirection = 2;
				}
				if(firstChoice == 3){
					tempX += -1;
					tempDirection = 3;
				}
			}//end first if
	
			//previous direction = 3
			if(previousDirection == 3){
				if(firstChoice==1){
					tempY += 1;
					tempDirection = 4;
				}
				if(firstChoice == 2){
					tempY += -1;
					tempDirection = 2;
				}
				if(firstChoice == 3){
					tempX += -1;
					tempDirection = 3;
				}
			}//end first if

			//previous direction = 4
			if(previousDirection == 4){
				if(firstChoice==1){
					tempX += 1;
					tempDirection = 1;
				}
				if(firstChoice == 2){
					tempY += 1;
					tempDirection = 4;
				}
				if(firstChoice == 3){
					tempX += -1;
					tempDirection = 3;
				}
			}

			
			//first check for duplicate
			for (int k=0;k<i-1;k++){

				if (currentX + tempX == this.getX(k) && currentY + tempY == this.getY(k)){
					System.out.println("Duplicate Found!");
					tempX = 0;
					tempY = 0;

					//previous direction = 1
					if(previousDirection == 1){
						if(secondChoice==1){
							tempX += 1;
							tempDirection = 1;
						}//end if
						if(secondChoice == 2){
							tempY += -1;
							tempDirection = 2;
						}
						if(secondChoice == 3){
							tempY += 1;
							tempDirection = 4;
						}
					}

					//previous direction = 2
					if(previousDirection == 2){
						if(secondChoice==1){
							tempX += 1;
							tempDirection = 1;
						}//end if
						if(secondChoice == 2){
							tempY += -1;
							tempDirection = 2;
						}
						if(secondChoice == 3){
							tempX += -1;
							tempDirection = 3;
						}
					}
		
					//previous direction = 3
					if(previousDirection == 3){
						if(secondChoice==1){
							tempY += 1;
							tempDirection = 4;
						}//end if
						if(secondChoice == 2){
							tempY += -1;
							tempDirection = 2;
						}
						if(secondChoice == 3){
							tempX += -1;
							tempDirection = 3;
						}
					}

					//previous direction = 4
					if(previousDirection == 4){
						if(secondChoice==1){
							tempX += 1;
							tempDirection = 1;
						}//end if
						if(secondChoice == 2){
							tempY += 1;
							tempDirection = 4;
						}
						if(secondChoice == 3){
							tempX += -1;
							tempDirection = 3;
						}
					}

				}//test for dup

			}//end for k
			

		
			//final check for duplicate
			for (int l=0;l<i-1;l++){

				if (currentX + tempX == this.getX(l) && currentY + tempY == this.getY(l)){
					System.out.println("Duplicate Found!");

					tempX = 0;
					tempY = 0;

					//previous direction = 1
					if(previousDirection == 1){
						if(thirdChoice==1){
							tempX += 1;
							tempDirection = 1;
						}//end if
						if(thirdChoice == 2){
							tempY += -1;
							tempDirection = 2;
						}
						if(thirdChoice == 3){
							tempY += 1;
							tempDirection = 4;
						}
					}

					//previous direction = 2
					if(previousDirection == 2){
						if(thirdChoice==1){
							tempX += 1;
							tempDirection = 1;
						}//end if
						if(thirdChoice == 2){
							tempY += -1;
							tempDirection = 2;
						}
						if(thirdChoice == 3){
							tempX += -1;
							tempDirection = 3;
						}
					}
		
					//previous direction = 3
					if(previousDirection == 3){
						if(thirdChoice==1){
							tempY += 1;
							tempDirection = 4;
						}//end if
						if(thirdChoice == 2){
							tempY += -1;
							tempDirection = 2;
						}
						if(thirdChoice == 3){
							tempX += -1;
							tempDirection = 3;
						}
					}

					//previous direction = 4
					if(previousDirection == 4){
						if(thirdChoice==1){
							tempX += 1;
							tempDirection = 1;
						}//end if
						if(thirdChoice == 2){
							tempY += 1;
							tempDirection = 4;
						}
						if(thirdChoice == 3){
							tempX += -1;
							tempDirection = 3;
						}
					}

				}//last test for dup

			}//end for l
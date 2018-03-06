
		//for each row
		for (int i=2;i<getLength();i++){

			int tempX=0;
			int tempY=0;

			boolean valid = false;

			tempX=0;
			tempY=0;
			//previousDirection = 1;
			int firstChoice = rn.nextInt(3)+1;
			int secondChoice = 6 - firstChoice;
			int thirdChoice = 6 - firstChoice - secondChoice;
			int original = previousDirection;


			valid = true;

			//first choice no while loop

			if (previousDirection == 1){	
				if (firstChoice == 1) {
					tempX += 1;
					previousDirection = 1;
				}
				else if (firstChoice==2){
					tempY += -1;
					previousDirection = 2;
				}
				else if(firstChoice == 3) {
					tempY += 1;
					previousDirection = 4;
				}
			}//end first if

			else if (previousDirection == 2) {
				if(firstChoice == 1){
					tempX += -1;
					previousDirection = 3;
				}
				else if(firstChoice == 2){
					tempX+= 1;
					previousDirection = 1;
				}
				else if(firstChoice == 3){
					tempY += -1;
					previousDirection = 2;
				}
			}

			else if (previousDirection ==3 ) {
				if (firstChoice == 1){
					tempX += -1;
				}
				else if(firstChoice == 2){
					tempY += -1;
					previousDirection = 2;
				}
				else if (firstChoice == 3){
					tempY += 1;
					previousDirection = 4;
				}
			}

			else if (previousDirection == 4) {
				if(firstChoice==1){
					tempX += 1;
					previousDirection = 1;
				}
				else if (firstChoice==2){
					tempX += -1;
					previousDirection = 3;
				}
				else if (firstChoice == 3){
					tempY += 1;
					previousDirection = 4;
				}
			}
			else {
				System.out.println("ERROR PICKING");
			}

			//first check for duplicate
			for (int j=0;j<i-1;j++){
				if (currentX + tempX == this.getX(j) && currentY + tempY == this.getY(j)){
					System.out.println("FOUND CONFLICTING POINTS!");
					valid = false;
				}
			}//end for

			//second choice only if duplicate
			while (valid == false) {

				previousDirection = original;
				tempX = 0;
				tempY = 0;

				if (previousDirection == 1){	
					if (secondChoice == 1) {
						tempX += 1;
						previousDirection = 1;
					}
					else if (secondChoice==2){
						tempY += -1;
						previousDirection = 2;
					}
					else if(secondChoice == 3) {
						tempY += 1;
						previousDirection = 4;
					}
				}//end first if

				else if (previousDirection == 2) {
					if(secondChoice == 1){
						tempX += -1;
						previousDirection = 3;
					}
					else if(secondChoice == 2){
						tempX+= 1;
						previousDirection = 1;
					}
					else if(secondChoice == 3){
						tempY += -1;
						previousDirection = 2;
					}
				}

				else if (previousDirection ==3 ) {
					if (secondChoice == 1){
						tempX += -1;
					}
					else if(secondChoice == 2){
						tempY += -1;
						previousDirection = 2;
					}
					else if (secondChoice == 3){
						tempY += 1;
						previousDirection = 4;
					}
				}

				else if (previousDirection == 4) {
					if(secondChoice==1){
						tempX += 1;
						previousDirection = 1;
					}
					else if (secondChoice==2){
						tempX += -1;
						previousDirection = 3;
					}
					else if (secondChoice == 3){
						tempY += 1;
						previousDirection = 4;
					}
				}
				else {
					//System.out.println("ERROR PICKING");
				}
			

				valid = true;

			}//end while


			//
			for (int k=0;k<i-1;k++){
	
				if (currentX + tempX == this.getX(k) && currentY + tempY == this.getY(k)){
					System.out.println("FOUND CONFLICTING POINTS!");
					valid = false;
				}
			}//end for

			while (valid == false) {

				previousDirection = original;
				tempX = 0;
				tempY = 0;

				if (previousDirection == 1){	
					if (thirdChoice == 1) {
						tempX += 1;
						previousDirection = 1;
					}
					else if (thirdChoice==2){
						tempY += -1;
						previousDirection = 2;
					}
					else if(thirdChoice == 3) {
						tempY += 1;
						previousDirection = 4;
					}
				}//end first if

				else if (previousDirection == 2) {
					if(thirdChoice == 1){
						tempX += -1;
						previousDirection = 3;
					}
					else if(thirdChoice == 2){
						tempX+= 1;
						previousDirection = 1;
					}
					else if(thirdChoice == 3){
						tempY += -1;
						previousDirection = 2;
					}
				}

				else if (previousDirection ==3 ) {
					if (thirdChoice == 1){
						tempX += -1;
					}
					else if(thirdChoice == 2){
						tempY += -1;
						previousDirection = 2;
					}
					else if (thirdChoice == 3){
						tempY += 1;
						previousDirection = 4;
					}
				}

				else if (previousDirection == 4) {
					if(thirdChoice==1){
						tempX += 1;
						previousDirection = 1;
					}
					else if (thirdChoice==2){
						tempX += -1;
						previousDirection = 3;
					}
					else if (thirdChoice == 3){
						tempY += 1;
						previousDirection = 4;
					}
				}
				else {
					//System.out.println("ERROR PICKING");
				}
			

				valid = true;
		
			}//end while


			currentX += tempX;
			currentY += tempY;

			this.setX(i,currentX);
			this.setY(i,currentY);


		}//end for i

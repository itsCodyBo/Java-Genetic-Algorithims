
		
		myClimber.buildArray(firstSequence);
		
		//System.out.println("First Sequence : " + Arrays.toString(firstSequence));
		System.out.println("The count is " + myClimber.countV(firstSequence));
		firstFitness = myClimber.getFitness(firstSequence);
		System.out.println("The fitness is " + firstFitness);

		System.out.println("******THIS IS THE END OF THE FIRST SEQUENCE*******");

		//START SECOND SEQUENCE BUILD
		secondSequence = firstSequence;

		myClimber.changeBit(secondSequence);
		
		//System.out.println("Second Sequence : " + Arrays.toString(secondSequence));
		System.out.println("The count is " + myClimber.countV(secondSequence));
		secondFitness = myClimber.getFitness(secondSequence);
		System.out.println("The fitness is " + secondFitness);
		System.out.println("******THIS IS THE END OF THE SECOND SEQUENCE*******");

		
		if(firstFitness >= secondFitness){
			System.out.println("Keep first sequence");
			seqeuenceToKeep = firstSequence;


			//System.out.println("First Sequence : " + Arrays.toString(firstSequence));
			System.out.println("The count is " + myClimber.countV(seqeuenceToKeep));
			firstFitness = myClimber.getFitness(seqeuenceToKeep);
			System.out.println("The fitness is " + firstFitness);


		}
		else if (secondFitness > firstFitness) {
			System.out.println("Replace with second string");
			seqeuenceToKeep = secondSequence;

			//System.out.println("First Sequence : " + Arrays.toString(firstSequence));
			System.out.println("The count is " + myClimber.countV(seqeuenceToKeep));
			firstFitness = myClimber.getFitness(seqeuenceToKeep);
			System.out.println("The fitness is " + firstFitness);


		}
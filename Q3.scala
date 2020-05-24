object Q3{
		def main(args:Array[String])
		{   
		    var coverprice=24.95D;
			var discount=40D;
			var noOfCopies=60D;
            var costOfBooks=0D;
            var shipCostto50Copies=3D;
            var shipCostAfter50Copies=0.75D;
			
			if(noOfCopies > 50){
			    costOfBooks=(coverprice*noOfCopies*(100-discount)/100)+(50*shipCostto50Copies)+((noOfCopies-50)*shipCostAfter50Copies);
				}
			else{
			    costOfBooks=(coverprice*noOfCopies*(100-discount)/100)+(noOfCopies*shipCostAfter50Copies);
				}
            println("Cost of books:"+costOfBooks);
		}	
}

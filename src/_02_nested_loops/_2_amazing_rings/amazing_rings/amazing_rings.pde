int x = 0;
int x2 =1500;
int direction = 1;
  /*** Go to the recipe to run the demonstration before starting this program ***/

void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(1500,1000);
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();
}

void draw() {
  background(220);
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          
          
            for(int i = 8; i > 0; i--){
  //Use an if statement and modulo to alternate the color of your rings.
   /*if(i % 2 == 0){
   fill(255,255,255); 
  } else {
    fill(0,0,0);
  }*/
  noFill();
            
   ellipse(x,400, i * 100, i * 100);
   ellipse(x2,400,i * 100, i * 100);
   
            }
            x+=5 * direction;
            x2-=5 * direction;
         if(x >= width || x <= 0){
           direction *= -1;
         }
          
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
        
       
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
        
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
            
}

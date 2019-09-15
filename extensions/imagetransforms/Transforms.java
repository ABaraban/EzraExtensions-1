package extensions.imagetransforms;

import java.awt.Color;

import support.sedgewick.Picture;


public class Transforms {
	
	/**
	 * This one is solved for you.
	 * @param source
	 * @param target
	 */
	public static void flipHoriz(Picture source, Picture target) { 
		for (int x = 0; x < source.width(); x++) {
			for (int y = 0; y < source.height(); y++) {
				//
				// Convince yourself that otherX is the x coordinate flipped,
				//     on the other side of the image by doing the following:
				// Check that this is true when x == 0
				//      then otherX = source.width() - 1
				//      which is indeed the rightmost pixel
				// Check that this is true when x == source.width()-1
				//      then otherX = 0
				//      which is indeed the leftmost pixel
				//
				int otherX = source.width() - 1 - x;  // otherX is the mirror of x
				Color c = source.get(otherX, y);      // get the Color at the mirror point of the source
				target.set(x, y, c);                  // and set it at x,y in the target
			}
		}
	}
	
	public static void flipVert(Picture source, Picture target) {
		for(int x = 0; x<source.width(); x++){
			for(int y=0;y<source.height();y++){
				int otherY = source.height() -1 -y;
				Color d = source.get(x,otherY);
				target.set(x,y,d);
			}
		}
		// FIXME
	}
	
	
	public static void flipHorizLeftHalf(Picture source, Picture target) {
		for(int x=0; x<source.width(); x++) {
			for (int y= 0; y<source.height(); y++){
				if (x>(source.width()/2)) {
					int leftHalf = source.width() - 1 - x;
					Color e = source.get(leftHalf, y);
					target.set(x, y, e);
				}
				else {
					Color c = source.get(x,y);
					target.set(x,y,c);
				}
			}
		}
		// FIXME
	}
	
	public static void flipVertBotHalf(Picture source, Picture target) {
		for(int x=0; x<source.width(); x++) {
			for (int y= 0; y<source.height(); y++){
				if (y>(source.height()/2)) {
					int flip = source.height() - 1 - y;
					Color e = source.get(x, flip);
					target.set(x, y, e);
				}
				else {
					Color c = source.get(x,y);
					target.set(x,y,c);
				}
			}
		}

		// FIXME
	}
	
	public static void gradient(Picture target) {
		System.out.println(target.height() + "height");
		System.out.println(target.width() + "width");
		for(int x=0; x<target.width(); x++) {
			int amountRed = target.width()*x;
			for (int y= 0; y<target.height(); y++){
				int amountGreen = target.height()*y;
				Color c = new Color(amountRed, amountGreen, 128);
				target.set(x, y, c);
				}

			}

		}


		// FIXME

	
	public static void edgeDetect(Picture source, Picture target) {
		// FIXME
	}
	
	public static void digitalFilter(Picture source, Picture target) {
		// FIXME	
	}



}

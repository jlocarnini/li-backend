package com.labelinsight.linearchamber;

import java.util.ArrayList;
import java.util.List;

public class LinearChamber {

    private boolean[] leftParticleGroup;
    private boolean[] rightParticleGroup;
    private int particleGroupSize;

    // Animate the full path taken for both Left and Right moving
    // particles in the chamber.
    public String[] animate(String init, int speed) {
        // list to store successive movements
        List<String> particlePaths = new ArrayList<>();
        // initialize the chamber, obtaining number of frames
        int numberFrames = initChamber(init, speed);
        // generate each frame, based on the speed  given
        int currFrame = 0;
        for (int i = 0; i < numberFrames; i++) {
            particlePaths.add(generateFrame(currFrame));
            currFrame += speed;
        }

        return particlePaths.toArray(new String[particlePaths.size()]);
    }

    // Generate all particle locations in a single frame
    private String generateFrame(int frameIndex) {
        StringBuilder generatedFrame = new StringBuilder();

        // iterate through all particle locations,
        // 'drawing' as we go
        for (int i = 0; i < particleGroupSize; i++) {
            // we use the frameIndex to compensate
            // for the shifting offset
            int rOffset = (i - frameIndex);
            int lOffset = (i + frameIndex);

            // ensure the offsets are in range, then compare
            // this offset index of both the left and right particles
            if (((rOffset >= 0) && (rightParticleGroup[rOffset]))
                    || ((lOffset < particleGroupSize) && (leftParticleGroup[lOffset])))
                generatedFrame.append('X');
            else
                generatedFrame.append('.');
        }

        return generatedFrame.toString();
    }

    // Initialize the 2 particle groups as arrays, defaulting to false.
    // Iterate over the string, marking the appropriate group index
    // as true when either an L or R is found.
    // Return the number of frames required to fully animate particles.
    private int initChamber(String init, int speed) {
        leftParticleGroup = new boolean[init.length()];
        rightParticleGroup = new boolean[init.length()];
        particleGroupSize = init.length();

        for (int i = 0; i < init.length(); i++) {
            if (init.charAt(i) == 'L')
                leftParticleGroup[i] = true;
            if (init.charAt(i) == 'R')
                rightParticleGroup[i] = true;
        }

        // calculate the number of frames needed, based on the
        // leftmost right particle or the rightmost left particle
        for (int i = 0; i < particleGroupSize; i++)
            if (rightParticleGroup[i] || leftParticleGroup[particleGroupSize -i -1])
                return (int) Math.ceil((double) (particleGroupSize -i) / speed) +1;
        return 1;
    }

}

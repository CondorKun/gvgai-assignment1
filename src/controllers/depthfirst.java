package controllers;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

import core.game.Observation;
import core.game.StateObservation;
import core.player.AbstractPlayer;
import ontology.Types;
import tools.ElapsedCpuTimer;

/**
 * Created with IntelliJ IDEA.
 * Fzk 181240012
 * This is for the task 1 in Assignment 1.
 */
/*
public class Agent extends AbstractPlayer{

    protected Random randomGenerator;
    protected ArrayList<Observation> grid[][];
    protected int block_size;

    public Agent(StateObservation so, ElapsedCpuTimer elapsedTimer){
        grid = so.getObservationGrid();
        block_size = so.getBlockSize();
    }
    public Types.ACTIONS act(StateObservation stateObs, ElapsedCpuTimer elapsedTimer){

        ArrayList<Observation>[] npcPositions = stateObs.getNPCPositions();
        ArrayList<Observation>[] fixedPositions = stateObs.getImmovablePositions();
        ArrayList<Observation>[] movingPositions = stateObs.getMovablePositions();
        ArrayList<Observation>[] resourcesPositions = stateObs.getResourcesPositions();
        ArrayList<Observation>[] portalPositions = stateObs.getPortalsPositions();
        grid = stateObs.getObservationGrid();

        Types.ACTIONS action = null;
        StateObservation stCopy = stateObs.copy();

        double avgTimeTaken = 0;
        double acumTimeTaken = 0;
        long remaining = elapsedTimer.remainingTimeMillis();
        int numIters = 0;

        int remainingLimit = 5;
        while(remaining > 2*avgTimeTaken && remaining > remainingLimit){
            ElapsedCpuTimer elapsedTimerIteration = new ElapsedCpuTimer();
            ArrayList<Types.ACTIONS> actins = stateObs.getAvailableActions();


            /**
             * Order of steps: left, down, right, up;
             * first, use "CheckPosition()" to check if the left position has been reached;   *1*
             * if true, check the position below, and go on, until there is a "false",
             * then, go toward the direction.
             * After taking the step, check if the situation has been changed. use "CheckSituation()";
             * if so:
             *      check if the game is over:
             *              if so , return win or lose
             *              if not, go to *1*
             * if not:
             *      this operation is useless, go to the next item in *1* .
             *
             *  What do I need?
             *      an array to store the position which has been reached;
             *      a function to choose the direction to go, according to the order above (control these function below);
             *      a function to check if the position has been reached ( or in the array);
             *      a function to execute the move;
             *      a function to check the change, and return things;
             *//*

        }


    }



}
*/



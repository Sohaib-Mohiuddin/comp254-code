package com.opsdevelop.teaching.Labs.Lab9Exercises.Lesson9Files;/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position;

import java.util.Iterator;

/**
 * An interface for a tree where nodes can have an arbitrary number of children.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public interface Tree<E> extends Iterable<E> {

  /**
   * Returns the root com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position of the tree (or null if tree is empty).
   * @return root com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position of the tree (or null if tree is empty)
   */
  Position<E> root();

  /**
   * Returns the com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position of p's parent (or null if p is root).
   *
   * @param p    A valid com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position within the tree
   * @return com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position of p's parent (or null if p is root)
   * @throws IllegalArgumentException if p is not a valid com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position for this tree.
   */
  Position<E> parent(Position<E> p) throws IllegalArgumentException;

  /**
   * Returns an iterable collection of the Positions representing p's children.
   *
   * @param p    A valid com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position within the tree
   * @return iterable collection of the Positions of p's children
   * @throws IllegalArgumentException if p is not a valid com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position for this tree.
   */
  Iterable<Position<E>> children(Position<E> p)
                                   throws IllegalArgumentException;

  /**
   * Returns the number of children of com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position p.
   *
   * @param p    A valid com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position within the tree
   * @return number of children of com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position p
   * @throws IllegalArgumentException if p is not a valid com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position for this tree.
   */
  int numChildren(Position<E> p) throws IllegalArgumentException;

  /**
   * Returns true if com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position p has one or more children.
   *
   * @param p    A valid com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position within the tree
   * @return true if p has at least one child, false otherwise
   * @throws IllegalArgumentException if p is not a valid com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position for this tree.
   */
  boolean isInternal(Position<E> p) throws IllegalArgumentException;

  /**
   * Returns true if com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position p does not have any children.
   *
   * @param p    A valid com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position within the tree
   * @return true if p has zero children, false otherwise
   * @throws IllegalArgumentException if p is not a valid com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position for this tree.
   */
  boolean isExternal(Position<E> p) throws IllegalArgumentException;

  /**
   * Returns true if com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position p represents the root of the tree.
   *
   * @param p    A valid com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position within the tree
   * @return true if p is the root of the tree, false otherwise
   * @throws IllegalArgumentException if p is not a valid com.opsdevelop.teaching.Labs.Lab12Exercises.Lesson12Files.Position for this tree.
   */
  boolean isRoot(Position<E> p) throws IllegalArgumentException;

  /**
   * Returns the number of nodes in the tree.
   * @return number of nodes in the tree
   */
  int size();

  /**
   * Tests whether the tree is empty.
   * @return true if the tree is empty, false otherwise
   */
  boolean isEmpty();

  /**
   * Returns an iterator of the elements stored in the tree.
   * @return iterator of the tree's elements
   */
  Iterator<E> iterator();

  /**
   * Returns an iterable collection of the positions of the tree.
   * @return iterable collection of the tree's positions
   */
  Iterable<Position<E>> positions();
}

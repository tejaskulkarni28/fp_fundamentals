package Sequences

object Vector extends App {
  // syntax
  // final class Vector[+A]
//  the defaut implementation for immutable sequences
//    effectively constnat indexed read and write: O(log32(n))
//    fast element addition: append/prepend
//    implemented as a fixed-branched trie (branch factor 32)


  // list
  // keeps reference to tail
  // updating an element in the muddle takes long
  // vector
  // depth of the tree is small
  // needs to replace an entire 32-element chunk
}

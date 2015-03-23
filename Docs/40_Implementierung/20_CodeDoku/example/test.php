<?php

/*!
  @brief Brief description.
 
  This is a detailed description of the class.
  
 */


class Test extends Test2 {
        protected $member_protected = ['asdf', 'sadf', 'asdf', 'asdf']; ///< Protected member of the Test class.
        public $member_public = 'adsf';  //!< Public member of the Test class.
        private $member_private = 'asfe'; //!< Private member, a String.

        public function testfunc() //!< A test method.
        {
		echo "Hello World!";
        }

}

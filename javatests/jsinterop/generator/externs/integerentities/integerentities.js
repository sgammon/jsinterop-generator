/**
 * @fileoverview Test conversion of integer entities.
 * @externs
 */

/**
 * @constructor
 */
function Foo() {}

/**
 * @param {number} integerParam
 * @param {number} doubleParam
 * @param {function(number):undefined} callback
 * @return {number}
 */
Foo.prototype.foo = function(integerParam, doubleParam, callback) {};

/**
 * @type {number}
 */
Foo.prototype.bar;

/**
 * @type {number}
 */
Foo.baz;

/**
 * @param {number|string} unionParam
 */
Foo.prototype.union = function(unionParam) {};

/**
 * Test method on the global Scope.
 * @param {number} bar
 * @return {number}
 */
function foo(bar) {}

/**
 * @type {number}
 */
var baz;

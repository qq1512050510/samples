/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.OpenapiJsClient);
  }
}(this, function(expect, OpenapiJsClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new OpenapiJsClient.NetCordaCoreNodeServicesVaultCriteriaExpressionNotAllOf();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('NetCordaCoreNodeServicesVaultCriteriaExpressionNotAllOf', function() {
    it('should create an instance of NetCordaCoreNodeServicesVaultCriteriaExpressionNotAllOf', function() {
      // uncomment below and update the code to test NetCordaCoreNodeServicesVaultCriteriaExpressionNotAllOf
      //var instane = new OpenapiJsClient.NetCordaCoreNodeServicesVaultCriteriaExpressionNotAllOf();
      //expect(instance).to.be.a(OpenapiJsClient.NetCordaCoreNodeServicesVaultCriteriaExpressionNotAllOf);
    });

    it('should have the property expression (base name: "expression")', function() {
      // uncomment below and update the code to test the property expression
      //var instane = new OpenapiJsClient.NetCordaCoreNodeServicesVaultCriteriaExpressionNotAllOf();
      //expect(instance).to.be();
    });

  });

}));

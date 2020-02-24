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
    instance = new OpenapiJsClient.CordappsApi();
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

  describe('CordappsApi', function() {
    describe('cordapps', function() {
      it('should call cordapps successfully', function(done) {
        //uncomment below and update the code to test cordapps
        //instance.cordapps(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('cordappsBootcampOpenapiFlowsBootcampGetAllTokensFlow', function() {
      it('should call cordappsBootcampOpenapiFlowsBootcampGetAllTokensFlow successfully', function(done) {
        //uncomment below and update the code to test cordappsBootcampOpenapiFlowsBootcampGetAllTokensFlow
        //instance.cordappsBootcampOpenapiFlowsBootcampGetAllTokensFlow(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('cordappsBootcampOpenapiFlowsBootcampTokenIssueFlowInitiator', function() {
      it('should call cordappsBootcampOpenapiFlowsBootcampTokenIssueFlowInitiator successfully', function(done) {
        //uncomment below and update the code to test cordappsBootcampOpenapiFlowsBootcampTokenIssueFlowInitiator
        //instance.cordappsBootcampOpenapiFlowsBootcampTokenIssueFlowInitiator(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('cordappsCordappFlows', function() {
      it('should call cordappsCordappFlows successfully', function(done) {
        //uncomment below and update the code to test cordappsCordappFlows
        //instance.cordappsCordappFlows(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('cordappsProgressTracker', function() {
      it('should call cordappsProgressTracker successfully', function(done) {
        //uncomment below and update the code to test cordappsProgressTracker
        //instance.cordappsProgressTracker(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));

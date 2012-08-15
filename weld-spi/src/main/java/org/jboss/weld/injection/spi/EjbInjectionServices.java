/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 

package org.jboss.weld.injection.spi;

import javax.enterprise.inject.spi.InjectionPoint;

import org.jboss.weld.bootstrap.api.Service;

/**
 * A container should implement this interface to allow Weld to
 * resolve EJB.
 * 
 * {@link EjbInjectionServices} is a per-module service.
 * 
 * @author Pete Muir
 * 
 */
public interface EjbInjectionServices extends Service
{
   /**
    * Used at bootstrap to register resource injection points found in the deployment.
    */
   <T> ResourceIdentifier<T> registerEjbInjectionPoint(InjectionPoint injectionPoint);

   /**
    * Used at runtime to obtain an instance of a registered resource
    */
   <T> T resolveEjb(ResourceIdentifier<T> identifier);
   
}

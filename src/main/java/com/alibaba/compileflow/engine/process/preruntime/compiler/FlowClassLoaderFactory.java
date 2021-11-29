package com.alibaba.compileflow.engine.process.preruntime.compiler;

import com.alibaba.compileflow.engine.common.extension.IExtensionPoint;
import com.alibaba.compileflow.engine.common.extension.annotation.ExtensionPoint;
import com.alibaba.compileflow.engine.common.extension.consts.ReducePolicy;

/**
 * @author yusu
 */
public interface FlowClassLoaderFactory extends IExtensionPoint {

    String EXT_FLOW_CLASS_LOADER_CODE = "com.alibaba.compileflow.engine.process.preruntime.compiler.FlowClassLoaderFactory.getFlowClassLoader";

    @ExtensionPoint(code = EXT_FLOW_CLASS_LOADER_CODE, reducePolicy = ReducePolicy.FISRT_MATCH)
    ClassLoader getFlowClassLoader();

}
